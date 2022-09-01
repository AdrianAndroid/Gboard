package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: bqk  reason: default package */
/* loaded from: classes.dex */
public final class bqk extends bqh {
    private static final ltg k = ltg.j("com/google/android/apps/inputmethod/latin/keyboard/widget/LatinMorseCandidateViewBuilder");
    private static final int[] l = {R.drawable.f45840_resource_name_obfuscated_res_0x7f080102, R.drawable.f45860_resource_name_obfuscated_res_0x7f080104, R.drawable.f45890_resource_name_obfuscated_res_0x7f080107};

    public bqk(Context context, bqi bqiVar) {
        super(context, bqiVar, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bqh, defpackage.deb
    public final void b(ico icoVar, iaj iajVar, int i, hln hlnVar, boolean z) {
        super.b(icoVar, iajVar, i, hlnVar, z);
        if (hlnVar.e == hlm.EXPRESSION) {
            return;
        }
        if (i < 3) {
            icoVar.q(new int[]{R.id.f52780_resource_name_obfuscated_res_0x7f0b00cf}, new Integer[]{Integer.valueOf(l[i])});
        } else {
            ((ltd) k.a(hip.a).k("com/google/android/apps/inputmethod/latin/keyboard/widget/LatinMorseCandidateViewBuilder", "fillInSoftKeyDefBuilderForCandidate", 52, "LatinMorseCandidateViewBuilder.java")).u("Morse candidate count should not exceed hint count:%d.", 3);
        }
    }
}
