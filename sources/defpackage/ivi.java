package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: ivi  reason: default package */
/* loaded from: classes.dex */
public final class ivi implements ipj {
    public static final ivi a = new ivi();
    private static final llw b = lrq.b;

    private ivi() {
    }

    @Override // defpackage.ipj
    public final ipi a(byte[] bArr) {
        myo myoVar = (myo) nfm.z(myo.a, bArr, nfb.b());
        return new iuz(7);
    }

    @Override // defpackage.ipj
    public final ipi b(ngz ngzVar) {
        if (ngzVar instanceof myo) {
            myo myoVar = (myo) ngzVar;
            return new iuz(7);
        }
        throw new IllegalArgumentException("Message is not instance of com.google.inputmethod.keyboard.tensorflow.TfCheckpointProtos.TfCheckpoint");
    }

    @Override // defpackage.ipj
    public final ngf c(String str) {
        return (ngf) b.get(str);
    }

    @Override // defpackage.ipj
    public final Collection d() {
        return b.keySet();
    }
}
