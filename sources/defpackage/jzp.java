package defpackage;

import android.util.JsonWriter;

/* compiled from: PG */
/* renamed from: jzp  reason: default package */
/* loaded from: classes.dex */
public final class jzp {
    public static final jzn a = jzn.a;
    public final JsonWriter b;
    public final jsb c;
    private final jzn d;

    public jzp() {
    }

    public jzp(JsonWriter jsonWriter, jsb jsbVar, jzn jznVar) {
        this.b = jsonWriter;
        this.c = jsbVar;
        this.d = jznVar;
    }

    public final boolean equals(Object obj) {
        jsb jsbVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof jzp) {
            jzp jzpVar = (jzp) obj;
            if (this.b.equals(jzpVar.b) && ((jsbVar = this.c) != null ? jsbVar.equals(jzpVar.c) : jzpVar.c == null) && this.d.equals(jzpVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        jsb jsbVar = this.c;
        return ((hashCode ^ (jsbVar == null ? 0 : jsbVar.hashCode())) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        return "JsonTraceConverter{writer=" + valueOf + ", argNameMapper=" + valueOf2 + ", argValueMapper=" + valueOf3 + "}";
    }
}
