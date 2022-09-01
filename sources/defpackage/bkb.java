package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: bkb  reason: default package */
/* loaded from: classes.dex */
enum bkb {
    svg,
    a,
    circle,
    clipPath,
    defs,
    desc,
    ellipse,
    g,
    image,
    line,
    linearGradient,
    marker,
    mask,
    path,
    pattern,
    polygon,
    polyline,
    radialGradient,
    rect,
    solidColor,
    stop,
    style,
    SWITCH,
    symbol,
    text,
    textPath,
    title,
    tref,
    tspan,
    use,
    view,
    UNSUPPORTED;
    
    private static final Map G = new HashMap();

    public static bkb a(String str) {
        Map map = G;
        bkb bkbVar = (bkb) map.get(str);
        if (bkbVar != null) {
            return bkbVar;
        }
        if (!str.equals("switch")) {
            try {
                bkb bkbVar2 = (bkb) Enum.valueOf(bkb.class, str);
                if (bkbVar2 != SWITCH) {
                    map.put(str, bkbVar2);
                    return bkbVar2;
                }
            } catch (IllegalArgumentException unused) {
            }
            Map map2 = G;
            bkb bkbVar3 = UNSUPPORTED;
            map2.put(str, bkbVar3);
            return bkbVar3;
        }
        bkb bkbVar4 = SWITCH;
        map.put(str, bkbVar4);
        return bkbVar4;
    }
}
