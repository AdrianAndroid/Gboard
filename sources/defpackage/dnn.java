package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import j$.time.Duration;

/* compiled from: PG */
/* renamed from: dnn */
/* loaded from: classes.dex */
public class dnn extends aih {
    public static final ltg aj = ltg.j("com/google/android/apps/inputmethod/libs/languageselection/preference/LanguageTagListPreferenceFragment");
    private static final long c = Duration.ofSeconds(10).toMillis();
    public hqy ak;
    public mko al;
    public PreferenceScreen am;
    private Preference d;

    public static /* bridge */ /* synthetic */ void aF(dnn dnnVar) {
        dnnVar.az(false);
    }

    public final void az(boolean z) {
        mko mkoVar;
        if (this.d != null) {
            aE().v(false);
            this.d = null;
        }
        if (z && (mkoVar = this.al) != null) {
            mkoVar.cancel(true);
        }
        this.al = null;
    }

    @Override // defpackage.aih, defpackage.an
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View G = super.G(layoutInflater, viewGroup, bundle);
        hqs.f(this.b, C());
        return G;
    }

    @Override // defpackage.an
    public void P(int i, int i2, Intent intent) {
        inx aE;
        if (i2 != -1 || (aE = aE()) == null) {
            return;
        }
        aE.y(this, -1, new Intent());
    }

    @Override // defpackage.an
    public void T() {
        super.T();
        az(true);
    }

    public void aD(Preference preference) {
        Bundle r = preference.r();
        if (r != null) {
            r.remove("AppBarLayoutController:EXPANDED");
        }
        aE().x(preference.v, r, 0, preference.q, this);
    }

    public final inx aE() {
        return (inx) B();
    }

    @Override // defpackage.aih, defpackage.aio
    public final boolean ax(Preference preference) {
        mko L;
        ((ltd) ((ltd) aj.b()).k("com/google/android/apps/inputmethod/libs/languageselection/preference/LanguageTagListPreferenceFragment", "onPreferenceTreeClick", 77, "LanguageTagListPreferenceFragment.java")).w("onPreferenceTreeClick: %s", preference.q);
        jav javVar = (jav) preference.r().getParcelable("LANGUAGE_TAG");
        if (javVar == null) {
            az(true);
            aD(preference);
            return true;
        }
        if (preference != this.d) {
            az(true);
            aE().v(true);
            this.d = preference;
            hqy hqyVar = this.ak;
            long j = c;
            mkr G = hrx.G();
            hrx hrxVar = (hrx) hqyVar;
            jga C = hrxVar.C(javVar, null);
            if (j > 0) {
                ijf.h(hrx.c, hrx.b);
            }
            ((ltd) ((ltd) hrx.a.b()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "loadInputMethodEntries", 1617, "InputMethodEntryManager.java")).F("loadInputMethodEntries: language=%s, timeOut=%d", javVar, j);
            jls g = C.g();
            if (hrxVar.o == null) {
                L = kcu.K(null);
            } else {
                L = kcu.L(hrxVar.o.d(javVar, g, G));
            }
            mko g2 = mio.g(L, hht.r, mjl.a);
            this.al = g2;
            kcu.U(g2, new bpn(this, g2, preference, javVar, 2), gyc.b);
        }
        return true;
    }

    @Override // defpackage.aih, defpackage.an
    public void e(Bundle bundle) {
        super.e(bundle);
        if (this.ak == null) {
            this.ak = hrx.y(B());
        }
    }

    @Override // defpackage.aih
    public void o(Bundle bundle, String str) {
        PreferenceScreen fL = fL();
        this.am = fL;
        if (fL == null) {
            PreferenceScreen e = this.a.e(B());
            this.am = e;
            aw(e);
        }
    }
}
