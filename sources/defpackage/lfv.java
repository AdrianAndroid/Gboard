package defpackage;

import java.util.regex.Matcher;

/* compiled from: PG */
/* renamed from: lfv  reason: default package */
/* loaded from: classes.dex */
final class lfv extends ldv {
    final /* synthetic */ kcl g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfv(lfy lfyVar, CharSequence charSequence, kcl kclVar, byte[] bArr, byte[] bArr2) {
        super(lfyVar, charSequence);
        this.g = kclVar;
    }

    @Override // defpackage.ldv
    public final int a(int i) {
        return ((Matcher) this.g.a).end();
    }

    @Override // defpackage.ldv
    public final int b(int i) {
        if (((Matcher) this.g.a).find(i)) {
            return ((Matcher) this.g.a).start();
        }
        return -1;
    }
}
