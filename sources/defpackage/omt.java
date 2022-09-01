package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: omt  reason: default package */
/* loaded from: classes2.dex */
final class omt implements Serializable {
    private static final long serialVersionUID = 0;
    private final String a;
    private final int b;

    public omt(String str, int i) {
        oll.e(str, "pattern");
        this.a = str;
        this.b = i;
    }

    private final Object readResolve() {
        Pattern compile = Pattern.compile(this.a, this.b);
        oll.d(compile, "compile(pattern, flags)");
        return new omu(compile);
    }
}
