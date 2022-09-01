package defpackage;

/* compiled from: PG */
/* renamed from: olv  reason: default package */
/* loaded from: classes2.dex */
public class olv implements Iterable {
    public final int a;
    public final int b;
    public final int c = 1;

    public olv(int i, int i2) {
        this.a = i;
        this.b = oli.c(i, i2, 1);
    }

    @Override // java.lang.Iterable
    /* renamed from: a */
    public final oju iterator() {
        return new oju(this.a, this.b);
    }

    public boolean b() {
        return this.a > this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof olv) {
            if (b() && ((olv) obj).b()) {
                return true;
            }
            olv olvVar = (olv) obj;
            if (this.a != olvVar.a || this.b != olvVar.b) {
                return false;
            }
            int i = olvVar.c;
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (b()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + 1;
    }

    public String toString() {
        return this.a + ".." + this.b + " step 1";
    }
}
