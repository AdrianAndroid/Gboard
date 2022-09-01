package defpackage;

import java.util.Locale;
import java.util.regex.Matcher;

/* compiled from: PG */
/* renamed from: jbb  reason: default package */
/* loaded from: classes.dex */
final class jbb {
    public final String a;
    public final String b;

    public jbb(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null subtype");
        }
        throw new NullPointerException("Null type");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jbb a(String str) {
        Matcher matcher = jbc.a.matcher(str.toLowerCase(Locale.US));
        if (!matcher.lookingAt()) {
            return null;
        }
        return new jbb(matcher.group(1), matcher.group(2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jbb) {
            jbb jbbVar = (jbb) obj;
            if (this.a.equals(jbbVar.a) && this.b.equals(jbbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return "SimpleMimeType{type=" + str + ", subtype=" + str2 + "}";
    }

    public jbb() {
    }
}
