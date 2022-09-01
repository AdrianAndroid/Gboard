package defpackage;

/* compiled from: PG */
/* renamed from: ltl  reason: default package */
/* loaded from: classes.dex */
final class ltl extends lur {
    public Object[] a = new Object[8];
    public int b = 0;

    public final int a(lty ltyVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(ltyVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.lur
    public final int b() {
        return this.b;
    }

    @Override // defpackage.lur
    public final lty c(int i) {
        if (i >= this.b) {
            throw new IndexOutOfBoundsException();
        }
        return (lty) this.a[i + i];
    }

    @Override // defpackage.lur
    public final Object d(lty ltyVar) {
        int a = a(ltyVar);
        if (a != -1) {
            return ltyVar.d(this.a[a + a + 1]);
        }
        return null;
    }

    @Override // defpackage.lur
    public final Object e(int i) {
        if (i >= this.b) {
            throw new IndexOutOfBoundsException();
        }
        return this.a[i + i + 1];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(c(i));
            sb.append("': ");
            sb.append(e(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
