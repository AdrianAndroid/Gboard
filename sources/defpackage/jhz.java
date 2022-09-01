package defpackage;

/* compiled from: PG */
/* renamed from: jhz  reason: default package */
/* loaded from: classes.dex */
public final class jhz {
    public byte a;
    private String b;
    private lfb c;
    private lfb d;

    public jhz() {
    }

    public jhz(byte[] bArr) {
        ldu lduVar = ldu.a;
        this.c = lduVar;
        this.d = lduVar;
    }

    public final jia a() {
        String str;
        if (this.a != 1 || (str = this.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" groupName");
            }
            if (this.a == 0) {
                sb.append(" preserveZipDirectories");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new jia(str, this.c, this.d);
    }

    public final void b(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null groupName");
    }
}
