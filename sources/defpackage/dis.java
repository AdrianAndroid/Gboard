package defpackage;

import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dis  reason: default package */
/* loaded from: classes.dex */
public final class dis extends hqq {
    final /* synthetic */ div a;

    public dis(div divVar) {
        this.a = divVar;
    }

    @Override // defpackage.hqq
    public final void a(llp llpVar) {
        int size = llpVar.size();
        for (int i = 0; i < size; i++) {
            hqt hqtVar = (hqt) llpVar.get(i);
            hhl hhlVar = div.a;
            String str = hqtVar.i().g;
            if (TextUtils.equals(str, "zh") || TextUtils.equals(str, "ko")) {
                this.a.e(hqtVar.i().q().toString());
            }
        }
    }
}
