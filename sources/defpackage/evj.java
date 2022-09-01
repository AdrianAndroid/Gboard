package defpackage;

/* compiled from: PG */
/* renamed from: evj  reason: default package */
/* loaded from: classes.dex */
public final class evj {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public evj() {
    }

    public evj(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static evi a() {
        return new evi();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof evj) {
            evj evjVar = (evj) obj;
            if (this.a == evjVar.a && this.b == evjVar.b && this.c == evjVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        return "SpeechLearningTaskSuccess{taskSuccess=" + z + ", deploySuccess=" + z2 + ", resultSuccess=" + z3 + "}";
    }
}
