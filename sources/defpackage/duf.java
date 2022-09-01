package defpackage;

import android.os.Bundle;
import androidx.preference.PreferenceScreen;
import com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment;

/* compiled from: PG */
/* renamed from: duf  reason: default package */
/* loaded from: classes.dex */
public final class duf extends CommonPreferenceFragment {
    public static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/preference/VoiceCommandsListFragment");
    private mko ac = kcu.K(fid.c);
    public dup d;
    public PreferenceScreen e;

    @Override // defpackage.aih, defpackage.an
    public final void i() {
        super.i();
        dup dupVar = this.d;
        if (dupVar == null) {
            ((ltd) ((ltd) c.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/preference/VoiceCommandsListFragment", "onStart", 61, "VoiceCommandsListFragment.java")).t("Trying to show commands list without client");
            return;
        }
        duz duzVar = (duz) dupVar;
        mko g = mio.g(mhu.h(mkh.q(kcu.P(new dus(duzVar, duzVar.c.a(), 2), duzVar.b)), nvw.class, new coa(duzVar, 13), mjl.a), dar.i, mjl.a);
        this.ac = g;
        kcu.U(g, new buo(this, 19), gyc.b);
    }

    @Override // defpackage.aih, defpackage.an
    public final void j() {
        super.j();
        this.ac.cancel(false);
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment, defpackage.aih
    public final void o(Bundle bundle, String str) {
        PreferenceScreen fL = fL();
        this.e = fL;
        if (fL == null) {
            PreferenceScreen e = this.a.e(B());
            this.e = e;
            aw(e);
        }
    }
}
