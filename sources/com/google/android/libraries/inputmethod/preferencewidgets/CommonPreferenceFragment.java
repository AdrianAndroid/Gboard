package com.google.android.libraries.inputmethod.preferencewidgets;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import androidx.preference.TwoStatePreference;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CommonPreferenceFragment extends aih implements ini {
    private iod c;

    private static PreferenceGroup aE(PreferenceGroup preferenceGroup, lfe lfeVar) {
        PreferenceGroup aE;
        int k = preferenceGroup.k();
        for (int i = 0; i < k; i++) {
            Preference o = preferenceGroup.o(i);
            if (!lfeVar.a(o)) {
                if ((o instanceof PreferenceGroup) && (aE = aE((PreferenceGroup) o, lfeVar)) != null) {
                    return aE;
                }
            } else {
                preferenceGroup.ai(o);
                return preferenceGroup;
            }
        }
        return null;
    }

    private static void aF(int i, PreferenceGroup preferenceGroup) {
        while (i < preferenceGroup.k()) {
            Preference o = preferenceGroup.o(i);
            o.K(false);
            if (o instanceof PreferenceGroup) {
                aF(0, (PreferenceGroup) o);
            }
            i++;
        }
    }

    private final void aG(inh inhVar, PreferenceGroup preferenceGroup, PreferenceGroup preferenceGroup2) {
        inhVar.c(this, preferenceGroup, preferenceGroup2, preferenceGroup2.A);
        int k = preferenceGroup2.k();
        while (true) {
            k--;
            if (k >= 0) {
                Preference o = preferenceGroup2.o(k);
                if (!(o instanceof PreferenceGroup)) {
                    inhVar.b(this, preferenceGroup2, o, o.A);
                } else {
                    aG(inhVar, preferenceGroup2, (PreferenceGroup) o);
                }
            } else {
                return;
            }
        }
    }

    private final void aH(String str, boolean z) {
        Preference l = fL().l(str);
        if (l == null) {
            return;
        }
        l.R(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    @Override // defpackage.aih, defpackage.an
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View G(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            ap r0 = r5.C()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int r1 = r5.aC()
            r2 = 0
            if (r1 == 0) goto L23
            ap r3 = r5.C()
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Resources$Theme r3 = r3.newTheme()
            r3.setTo(r0)
            r4 = 1
            r0.applyStyle(r1, r4)
            goto L24
        L23:
            r3 = r2
        L24:
            android.view.View r6 = super.G(r6, r7, r8)
            guu r7 = r5.aX()
            int r8 = r5.gc()
            r7.u(r8)
            if (r3 == 0) goto L38
            r0.setTo(r3)
        L38:
            android.support.v7.widget.RecyclerView r7 = r5.b
            r7.aw()
            android.content.Intent r7 = defpackage.iod.d(r5)
            if (r7 != 0) goto L45
        L43:
            r7 = r2
            goto L5f
        L45:
            java.lang.String r8 = ":settings:fragment_args_key"
            java.lang.String r7 = r7.getStringExtra(r8)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L52
            goto L43
        L52:
            java.lang.String r8 = ">"
            java.lang.String[] r7 = r7.split(r8)
            int r8 = r7.length
            if (r8 <= 0) goto L43
            int r8 = r8 + (-1)
            r7 = r7[r8]
        L5f:
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L66
            goto L6b
        L66:
            iod r2 = new iod
            r2.<init>(r5, r7)
        L6b:
            r5.c = r2
            if (r2 == 0) goto L88
            aih r7 = r2.a
            androidx.preference.PreferenceScreen r7 = r7.fL()
            if (r7 == 0) goto L7d
            r8 = 2147483647(0x7fffffff, float:NaN)
            r7.af(r8)
        L7d:
            aih r7 = r2.a
            android.support.v7.widget.RecyclerView r7 = r7.b
            r7.r(r2)
            r7 = 0
            defpackage.gur.B(r5, r7)
        L88:
            r5.aL()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment.G(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.an
    public void Q(Menu menu, MenuInflater menuInflater) {
        menu.clear();
    }

    @Override // defpackage.an
    public void U() {
        super.U();
        if (aB() == 1) {
            PreferenceScreen fL = fL();
            if (fL != null) {
                fL.ae();
            }
            bb();
        }
        ba();
        iod iodVar = this.c;
        if (iodVar != null) {
            iodVar.a.b.postDelayed(new ihi(iodVar, 6), 600L);
        }
    }

    protected void aA() {
    }

    protected int aB() {
        return 1;
    }

    protected int aC() {
        return 0;
    }

    protected void aL() {
        if (gc() == 0) {
            hqs.f(this.b, C());
        }
    }

    public final int aU() {
        return fL().k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final View aV(int i) {
        return aX().t(i);
    }

    public final Preference aW(int i) {
        String K = K(i);
        Preference hs = hs(K);
        if (hs != null) {
            return hs;
        }
        throw new IllegalArgumentException("Preference not found: ".concat(String.valueOf(K)));
    }

    public final guu aX() {
        return (guu) C();
    }

    public final void aY(int i) {
        aZ(i, null);
    }

    public final void aZ(int i, PreferenceGroup preferenceGroup) {
        PreferenceScreen fL = fL();
        int k = fL != null ? fL.k() : 0;
        try {
            aip aipVar = this.a;
            if (aipVar != null) {
                Context fT = fT();
                PreferenceScreen fL2 = fL();
                aipVar.f(true);
                int i2 = ail.a;
                Object[] objArr = new Object[2];
                String[] strArr = {String.valueOf(Preference.class.getPackage().getName()).concat("."), String.valueOf(SwitchPreference.class.getPackage().getName()).concat(".")};
                XmlResourceParser xml = fT.getResources().getXml(i);
                Preference a = ail.a(xml, fL2, fT, objArr, aipVar, strArr);
                xml.close();
                PreferenceScreen preferenceScreen = (PreferenceScreen) a;
                preferenceScreen.C(aipVar);
                aipVar.f(false);
                aw(preferenceScreen);
                PreferenceScreen fL3 = fL();
                aF(k, fL3);
                if (preferenceGroup == null) {
                    return;
                }
                int k2 = fL3.k();
                ArrayDeque arrayDeque = new ArrayDeque(k2 - k);
                while (true) {
                    k2--;
                    if (k2 < k) {
                        break;
                    }
                    Preference o = fL3.o(k2);
                    fL3.ai(o);
                    arrayDeque.addFirst(o);
                }
                while (true) {
                    Preference preference = (Preference) arrayDeque.pollFirst();
                    if (preference == null) {
                        return;
                    }
                    preference.M(Integer.MAX_VALUE);
                    preferenceGroup.ah(preference);
                }
            } else {
                throw new RuntimeException("This should be called after super.onCreate.");
            }
        } catch (RuntimeException e) {
            fT();
            throw new lgj("failed to add resource: ".concat(jbi.i(i)), e);
        }
    }

    @Override // defpackage.aih, defpackage.aim
    public final void au(Preference preference) {
        if (preference instanceof DialogPreferenceCompat) {
            String str = preference.t;
            inu inuVar = new inu();
            Bundle bundle = inuVar.m;
            if (bundle == null) {
                bundle = new Bundle(1);
                inuVar.Z(bundle);
            }
            bundle.putString("key", str);
            inuVar.ae(this, 0);
            inuVar.o(this.z);
            ((DialogPreferenceCompat) preference).ae((cv) inuVar.d);
            return;
        }
        super.au(preference);
    }

    @Override // defpackage.aih, defpackage.aio
    public final boolean ax(Preference preference) {
        Class r;
        Bundle bundle = preference.w;
        if (bundle != null) {
            ap B = B();
            String string = bundle.getString("START_ACTIVITY");
            Intent intent = null;
            if (string != null && (r = jbt.r(B.getClassLoader(), string)) != null) {
                intent = new Intent(B, r);
                String string2 = bundle.getString("START_ACTIVITY_DATA");
                if (string2 != null) {
                    intent.setData(Uri.parse(string2));
                }
            }
            if (intent != null) {
                af(intent);
                return true;
            }
        }
        return super.ax(preference);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ba() {
        ap B = B();
        if (!(B instanceof inb) || fL() == null) {
            return;
        }
        ((inb) B).q(this);
    }

    public final void bb() {
        int hr = hr();
        if (hr == 0) {
            return;
        }
        aY(hr);
        aA();
        if (aB() != 2) {
            return;
        }
        ba();
    }

    @Override // defpackage.ini
    public final int c(Object obj) {
        PreferenceGroup preferenceGroup = (PreferenceGroup) obj;
        int k = preferenceGroup.k();
        int i = 0;
        for (int i2 = 0; i2 < k; i2++) {
            if (preferenceGroup.o(i2).A) {
                i++;
            }
        }
        return i;
    }

    @Override // defpackage.ini
    public final Bundle d(Object obj) {
        return ((Preference) obj).w;
    }

    @Override // defpackage.aih, defpackage.an
    public void e(Bundle bundle) {
        super.e(bundle);
        this.a.a = ino.M(fS());
        as();
    }

    @Override // defpackage.ini
    public final Object g(int i) {
        PreferenceScreen fL = fL();
        if (fL != null) {
            return fL.l(K(i));
        }
        return null;
    }

    protected int gc() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int hr() {
        Context fS = fS();
        Bundle bundle = this.m;
        String str = null;
        String string = bundle != null ? bundle.getString("PREFERENCE_FRAGMENT") : null;
        if (string == null) {
            Intent intent = B().getIntent();
            if (intent != null) {
                str = intent.getStringExtra("PREFERENCE_FRAGMENT");
            }
        } else {
            str = string;
        }
        return jbi.c(fS, str);
    }

    @Override // defpackage.ini
    public final Object k(Object obj) {
        return ((Preference) obj).I;
    }

    @Override // defpackage.ini
    public final void l(int i, boolean z) {
        TwoStatePreference twoStatePreference = (TwoStatePreference) g(i);
        if (twoStatePreference == null) {
            return;
        }
        boolean z2 = twoStatePreference.x;
        twoStatePreference.x = false;
        twoStatePreference.k(z);
        twoStatePreference.x = z2;
    }

    @Override // defpackage.ini
    public final void m(int i, CharSequence charSequence) {
        Object g = g(i);
        if (g != null) {
            ((Preference) g).n(charSequence);
        }
    }

    @Override // defpackage.ini
    public final void n(int i, int i2, Object... objArr) {
        Object g = g(i);
        if (g != null) {
            ((Preference) g).Q(L(i2, objArr));
        }
    }

    @Override // defpackage.aih
    public void o(Bundle bundle, String str) {
        if (aB() == 0) {
            bb();
        }
    }

    @Override // defpackage.ini
    public final void p(Object obj, boolean z) {
        ((Preference) obj).R(z);
    }

    @Override // defpackage.ini
    public final void q(inh inhVar) {
        PreferenceScreen fL = fL();
        if (fL != null) {
            aG(inhVar, null, fL);
        }
    }

    @Override // defpackage.ini
    public final CharSequence r() {
        Object g = g(R.string.f162700_resource_name_obfuscated_res_0x7f140730);
        if (g != null) {
            return ((Preference) g).m();
        }
        return null;
    }

    @Override // defpackage.ini
    public final void s(int i) {
        aH(K(i), false);
    }

    @Override // defpackage.ini
    public final void t(int i) {
        aE(fL(), new ein(K(i), 15));
    }

    @Override // defpackage.ini
    public final void u(Object obj) {
        aE(fL(), new ein(obj, 16));
    }

    @Override // defpackage.ini
    public final String v() {
        Object g = g(R.string.f162520_resource_name_obfuscated_res_0x7f14071d);
        Object g2 = g(R.string.f162510_resource_name_obfuscated_res_0x7f14071c);
        if (g == null || g2 == null) {
            return null;
        }
        Preference preference = (Preference) g;
        String str = preference.y;
        preference.I(((Preference) g2).t);
        return str;
    }

    @Override // defpackage.ini
    public final void w(int i, boolean z) {
        Preference l = fL().l(K(i));
        if (l != null) {
            l.J(z);
        }
    }

    @Override // defpackage.ini
    public final void x(int i) {
        aH(K(i), true);
    }
}
