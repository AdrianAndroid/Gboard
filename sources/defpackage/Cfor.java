package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: for  reason: invalid class name and default package */
/* loaded from: classes.dex */
public final class Cfor {
    public final ijk a;
    private final int b;
    private final fnv c;
    private final String d;

    public Cfor(ijk ijkVar, fnv fnvVar, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = ijkVar;
        this.c = fnvVar;
        this.d = str;
        this.b = Arrays.hashCode(new Object[]{ijkVar, fnvVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Cfor)) {
            return false;
        }
        Cfor cfor = (Cfor) obj;
        return fyb.aJ(this.a, cfor.a) && fyb.aJ(this.c, cfor.c) && fyb.aJ(this.d, cfor.d);
    }

    public final int hashCode() {
        return this.b;
    }
}
