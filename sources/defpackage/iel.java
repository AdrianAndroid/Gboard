package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: iel  reason: default package */
/* loaded from: classes.dex */
public final class iel {
    public final String a;
    public final String b;
    public final Object c;
    public final int d;
    public final byte[] e;
    public final int f;

    public iel(int i, String str, String str2, Object obj, int i2, byte[] bArr) {
        this.f = i;
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = i2;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof iel)) {
            return false;
        }
        iel ielVar = (iel) obj;
        return this.f == ielVar.f && jdg.W(this.a, ielVar.a) && jdg.W(this.b, ielVar.b) && jdg.W(this.c, ielVar.c) && this.d == ielVar.d && Arrays.equals(this.e, ielVar.e);
    }

    public final int hashCode() {
        int hashCode = ((this.f * 31) + this.a.hashCode()) * 31;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Object obj = this.c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return ((((hashCode2 + i) * 31) + this.d) * 31) + Arrays.hashCode(this.e);
    }
}
