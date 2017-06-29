 package cn.gl.test1;

import java.awt.Color;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.WeakHashMap;

public final class FontData {

	private static final WeakHashMap<FontData, WeakReference<FontData>> FLY_WEIGHT_DATA = new WeakHashMap<FontData, WeakReference<FontData>>();
	private final int pointSize;
	private final String fontFace;
	private final Color color;
	private final Set<FontEffect> effects;
	String a;
	private FontData(int pointSize, String fontFace, Color color, EnumSet<FontEffect> effects) {
		this.pointSize = pointSize;
		this.fontFace = fontFace;
		this.color = color;
		this.effects = Collections.unmodifiableSet(effects);
	}

	public static FontData create(int pointSize, String fontFace, Color color, FontEffect... effects) {
		EnumSet<FontEffect> effectsSet = EnumSet.noneOf(FontEffect.class);
		for (FontEffect fontEffect : effects) {
			effectsSet.add(fontEffect);
		}
		FontData data = new FontData(pointSize, fontFace, color, effectsSet);
		WeakReference<FontData> ref = FLY_WEIGHT_DATA.get(data);
		FontData result = (ref != null) ? ref.get() : null; 
															
		if (result == null) {
			FLY_WEIGHT_DATA.put(data, new WeakReference<FontData>(data));
			result = data;
		}
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof FontData) {
			if (obj == this) {
				return true;
			}
			FontData other = (FontData) obj;
			return other.pointSize == pointSize && other.fontFace.equals(fontFace) && other.color.equals(color)
					&& other.effects.equals(effects);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return (pointSize * 37 + effects.hashCode() * 13) * fontFace.hashCode();
	}

}