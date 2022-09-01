package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: omu  reason: default package */
/* loaded from: classes2.dex */
public final class omu implements Serializable {
    public final Pattern a;

    public omu(Pattern pattern) {
        oll.e(pattern, "nativePattern");
        this.a = pattern;
    }

    private final Object writeReplace() {
        String pattern = this.a.pattern();
        oll.d(pattern, "nativePattern.pattern()");
        return new omt(pattern, this.a.flags());
    }

    public final String toString() {
        String pattern = this.a.toString();
        oll.d(pattern, "nativePattern.toString()");
        return pattern;
    }
}
