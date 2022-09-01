package defpackage;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: otj  reason: default package */
/* loaded from: classes2.dex */
public final class otj {
    public int a;
    public final Object b;

    public otj() {
        this.b = new int[10];
    }

    public otj(List list) {
        this.a = 0;
        this.b = list;
    }

    public otj(byte[] bArr) {
        this.b = new ReentrantLock();
    }

    public otj(byte[] bArr, byte[] bArr2) {
        this.b = new Object[256];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        return ((int[]) this.b)[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        if ((this.a & 2) != 0) {
            return ((int[]) this.b)[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.a & 128) != 0) {
            return ((int[]) this.b)[7];
        }
        return 65535;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(int i) {
        return ((1 << i) & this.a) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i, int i2) {
        if (i < 0 || i >= 10) {
            return;
        }
        this.a |= 1 << i;
        ((int[]) this.b)[i] = i2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    public final boolean f() {
        return this.a < this.b.size();
    }

    public final Object g() {
        int i = this.a;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = (Object[]) this.b;
            Object obj = objArr[i2];
            objArr[i2] = null;
            this.a = i2;
            return obj;
        }
        return null;
    }

    public final void h(Object obj) {
        int i = this.a;
        if (i < 256) {
            ((Object[]) this.b)[i] = obj;
            this.a = i + 1;
        }
    }
}
