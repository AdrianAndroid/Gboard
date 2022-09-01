package defpackage;

/* compiled from: PG */
/* renamed from: kng  reason: default package */
/* loaded from: classes.dex */
public final class kng {
    public static final ltg a = ltg.j("com/google/android/libraries/speech/encoding/CodecConfig");
    public final lfb b;
    public final lfb c;
    public final lfb d;
    public final int e;

    public kng() {
    }

    public kng(int i, lfb lfbVar, lfb lfbVar2, lfb lfbVar3) {
        this.e = i;
        this.b = lfbVar;
        this.c = lfbVar2;
        this.d = lfbVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kng)) {
            return false;
        }
        kng kngVar = (kng) obj;
        int i = this.e;
        int i2 = kngVar.e;
        if (i == 0) {
            throw null;
        }
        return i == i2 && this.b.equals(kngVar.b) && this.c.equals(kngVar.c) && this.d.equals(kngVar.d);
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return ((((((i ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
        }
        throw null;
    }

    public final String toString() {
        int i = this.e;
        String ad = i != 0 ? ndb.ad(i) : "null";
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        return "CodecConfig{format=" + ad + ", outputBitRate=" + valueOf + ", sampleRateHz=" + valueOf2 + ", channelCount=" + valueOf3 + "}";
    }
}
