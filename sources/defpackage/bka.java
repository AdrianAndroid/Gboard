package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: bka  reason: default package */
/* loaded from: classes.dex */
enum bka {
    CLASS,
    clip,
    clip_path,
    clipPathUnits,
    clip_rule,
    color,
    cx,
    cy,
    direction,
    dx,
    dy,
    fx,
    fy,
    d,
    display,
    fill,
    fill_rule,
    fill_opacity,
    font,
    font_family,
    font_size,
    font_weight,
    font_style,
    gradientTransform,
    gradientUnits,
    height,
    href,
    id,
    marker,
    marker_start,
    marker_mid,
    marker_end,
    markerHeight,
    markerUnits,
    markerWidth,
    mask,
    maskContentUnits,
    maskUnits,
    media,
    offset,
    opacity,
    orient,
    overflow,
    pathLength,
    patternContentUnits,
    patternTransform,
    patternUnits,
    points,
    preserveAspectRatio,
    r,
    refX,
    refY,
    requiredFeatures,
    requiredExtensions,
    requiredFormats,
    requiredFonts,
    rx,
    ry,
    solid_color,
    solid_opacity,
    spreadMethod,
    startOffset,
    stop_color,
    stop_opacity,
    stroke,
    stroke_dasharray,
    stroke_dashoffset,
    stroke_linecap,
    stroke_linejoin,
    stroke_miterlimit,
    stroke_opacity,
    stroke_width,
    style,
    systemLanguage,
    text_anchor,
    text_decoration,
    transform,
    type,
    vector_effect,
    version,
    viewBox,
    width,
    x,
    y,
    x1,
    y1,
    x2,
    y2,
    viewport_fill,
    viewport_fill_opacity,
    visibility,
    UNSUPPORTED;
    
    private static final Map aO = new HashMap();

    public static bka a(String str) {
        Map map = aO;
        bka bkaVar = (bka) map.get(str);
        if (bkaVar != null) {
            return bkaVar;
        }
        if (str.equals("class")) {
            bka bkaVar2 = CLASS;
            map.put(str, bkaVar2);
            return bkaVar2;
        } else if (str.indexOf(95) != -1) {
            bka bkaVar3 = UNSUPPORTED;
            map.put(str, bkaVar3);
            return bkaVar3;
        } else {
            try {
                bka bkaVar4 = (bka) Enum.valueOf(bka.class, str.replace('-', '_'));
                if (bkaVar4 != CLASS) {
                    map.put(str, bkaVar4);
                    return bkaVar4;
                }
            } catch (IllegalArgumentException unused) {
            }
            Map map2 = aO;
            bka bkaVar5 = UNSUPPORTED;
            map2.put(str, bkaVar5);
            return bkaVar5;
        }
    }
}
