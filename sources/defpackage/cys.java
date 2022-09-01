package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: cys  reason: default package */
/* loaded from: classes.dex */
public enum cys {
    GIF("gif"),
    GIF_TRANSPARENT("gif_transparent"),
    GIF_TINY("tinygif"),
    GIF_TINY_TRANSPARENT("tinygif_transparent"),
    PNG_TRANSPARENT("png_transparent");
    
    private static final lex g = lex.c(',');
    public final String f;

    cys(String str) {
        this.f = str;
    }

    public static String a(cys... cysVarArr) {
        return g.f(lre.ab(Arrays.asList(cysVarArr), cuv.p));
    }
}
