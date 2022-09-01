package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: jve  reason: default package */
/* loaded from: classes.dex */
public final class jve {
    public final llp a;
    public final byte[] b;
    private final String c;

    public jve(String str, llp llpVar, byte[] bArr) {
        if (str != null) {
            this.c = str;
            if (llpVar != null) {
                this.a = llpVar;
                this.b = bArr;
                return;
            }
            throw new NullPointerException("Null names");
        }
        throw new NullPointerException("Null superpackName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jve) {
            jve jveVar = (jve) obj;
            if (this.c.equals(jveVar.c) && lre.I(this.a, jveVar.a)) {
                boolean z = jveVar instanceof jve;
                if (Arrays.equals(this.b, jveVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        String str = this.c;
        String obj = this.a.toString();
        String arrays = Arrays.toString(this.b);
        return "SelectedPacks{superpackName=" + str + ", names=" + obj + ", syncMetadata=" + arrays + "}";
    }

    public jve() {
    }
}
