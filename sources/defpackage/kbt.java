package defpackage;

/* compiled from: PG */
/* renamed from: kbt  reason: default package */
/* loaded from: classes.dex */
public final class kbt {
    public final int a;
    public final int b;
    public final boolean c;

    public kbt() {
    }

    public kbt(byte[] bArr) {
        this.a = 11;
        this.b = 2;
        this.c = true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kbt) {
            kbt kbtVar = (kbt) obj;
            if (this.a == kbtVar.a && this.b == kbtVar.b && this.c == kbtVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ (-721379959)) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        boolean z = this.c;
        return "PrimesThreadsConfigurations{primesExecutorService=null, primesMetricExecutorPriority=" + i + ", primesMetricExecutorPoolSize=" + i2 + ", enableDeferredTasks=" + z + "}";
    }
}
