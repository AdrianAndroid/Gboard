package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hpg  reason: default package */
/* loaded from: classes.dex */
public final class hpg implements htb {
    final /* synthetic */ hph a;

    public hpg(hph hphVar) {
        this.a = hphVar;
    }

    @Override // defpackage.htb
    public final /* synthetic */ boolean s(ibz ibzVar) {
        return true;
    }

    @Override // defpackage.htb
    public final void t(Context context, hsz hszVar, iav iavVar, final ibz ibzVar, String str, jls jlsVar, final hta htaVar) {
        final hph hphVar = this.a;
        hphVar.f(ibzVar, new ibr() { // from class: hpd
            @Override // defpackage.ibr
            public final void b(ibm ibmVar) {
                hph hphVar2 = hph.this;
                ibz ibzVar2 = ibzVar;
                hta htaVar2 = htaVar;
                if (hphVar2.h || ibmVar == null) {
                    htaVar2.a(ibzVar2, null, ibmVar);
                    return;
                }
                hsy l = iin.l(hphVar2.d, hphVar2.g, ibmVar, hphVar2.e, ibzVar2);
                if (TextUtils.isEmpty(ibmVar.c)) {
                    ((ltd) ((ltd) hph.a.c()).k("com/google/android/libraries/inputmethod/inputbundle/KeyboardManager", "createKeyboardInternal", 305, "KeyboardManager.java")).w("keyboard class is empty %s", ibmVar);
                }
                htaVar2.a(ibzVar2, l, ibmVar);
            }
        });
    }

    @Override // defpackage.htb
    public final void u(Context context, ibz ibzVar, String str, jls jlsVar) {
        this.a.f(ibzVar, hpf.a);
    }
}
