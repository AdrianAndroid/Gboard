package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: ivf  reason: default package */
/* loaded from: classes.dex */
public final class ivf implements ipj {
    public static final ivf a = new ivf();
    private static final llw b = lrq.b;

    private ivf() {
    }

    @Override // defpackage.ipj
    public final ipi a(byte[] bArr) {
        mvm mvmVar = (mvm) nfm.z(mvm.l, bArr, nfb.b());
        return new iuz(6);
    }

    @Override // defpackage.ipj
    public final ipi b(ngz ngzVar) {
        if (ngzVar instanceof mvm) {
            mvm mvmVar = (mvm) ngzVar;
            return new iuz(6);
        }
        throw new IllegalArgumentException("Message is not instance of com.google.inputmethod.keyboard.decoder.LanguageModelDescriptorProtos.LanguageModelDescriptor");
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
