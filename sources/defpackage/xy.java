package defpackage;

/* compiled from: PG */
/* renamed from: xy  reason: default package */
/* loaded from: classes2.dex */
public class xy implements xx {
    private final Object[] a;
    private int b;

    public xy(int i) {
        this.a = new Object[i];
    }

    @Override // defpackage.xx
    public Object a() {
        int i = this.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.a;
            Object obj = objArr[i2];
            objArr[i2] = null;
            this.b = i2;
            return obj;
        }
        return null;
    }

    @Override // defpackage.xx
    public boolean b(Object obj) {
        int i = 0;
        while (true) {
            int i2 = this.b;
            if (i >= i2) {
                Object[] objArr = this.a;
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = obj;
                this.b = i2 + 1;
                return true;
            } else if (this.a[i] == obj) {
                throw new IllegalStateException("Already in the pool!");
            } else {
                i++;
            }
        }
    }
}
