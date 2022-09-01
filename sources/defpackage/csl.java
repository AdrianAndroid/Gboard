package defpackage;

import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: csl  reason: default package */
/* loaded from: classes.dex */
public final class csl {
    public static final csl a = b(ice.HEADER, R.id.f53790_resource_name_obfuscated_res_0x7f0b014b);
    public static final csl b = b(ice.BODY, R.id.f53790_resource_name_obfuscated_res_0x7f0b014b);
    public final ice c;
    public final int d;

    public csl() {
    }

    public csl(ice iceVar, int i) {
        this.c = iceVar;
        this.d = i;
    }

    public static csl a(icf icfVar) {
        return b(icfVar.b, icfVar.a);
    }

    public static csl b(ice iceVar, int i) {
        return new csl(iceVar, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof csl) {
            csl cslVar = (csl) obj;
            ice iceVar = this.c;
            if (iceVar != null ? iceVar.equals(cslVar.c) : cslVar.c == null) {
                if (this.d == cslVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ice iceVar = this.c;
        return (((iceVar == null ? 0 : iceVar.hashCode()) ^ 1000003) * 1000003) ^ this.d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        int i = this.d;
        return "KeyboardViewKey{type=" + valueOf + ", id=" + i + "}";
    }
}
