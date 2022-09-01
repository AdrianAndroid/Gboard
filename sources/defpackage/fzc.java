package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fzc  reason: default package */
/* loaded from: classes.dex */
public final class fzc extends fyj {
    final /* synthetic */ mld a;

    public fzc(mld mldVar) {
        this.a = mldVar;
    }

    @Override // defpackage.fyk
    public final void e(byte[] bArr, int i) {
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                jns jnsVar = fze.a;
                Object[] objArr = new Object[1];
                if (bArr == null) {
                    z = false;
                }
                objArr[0] = Boolean.valueOf(z);
                jnsVar.i("Training ended with error (hasRetryWindow=%s). ", objArr);
            } else if (i != 2) {
                fze.a.e("Training ended in unknown state.");
            }
            this.a.c(lfc.a(bArr, Integer.valueOf(i)));
        }
        jns jnsVar2 = fze.a;
        Object[] objArr2 = new Object[1];
        if (bArr == null) {
            z = false;
        }
        objArr2[0] = Boolean.valueOf(z);
        jnsVar2.g("Training ended with success (hasRetryWindow=%s).", objArr2);
        this.a.c(lfc.a(bArr, Integer.valueOf(i)));
    }
}
