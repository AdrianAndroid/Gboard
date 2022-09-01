package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment;

/* compiled from: PG */
/* renamed from: iny  reason: default package */
/* loaded from: classes.dex */
public class iny extends CommonPreferenceFragment {
    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment, defpackage.aih, defpackage.an
    public View G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View G = super.G(layoutInflater, viewGroup, bundle);
        av(0);
        return G;
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment, defpackage.an
    public final void Q(Menu menu, MenuInflater menuInflater) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment
    public final int hr() {
        return aX().l();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009d  */
    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment, defpackage.aih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(android.os.Bundle r10, java.lang.String r11) {
        /*
            r9 = this;
            guu r2 = r9.aX()
            ap r0 = r9.C()
            android.content.Intent r4 = r0.getIntent()
            if (r4 != 0) goto L10
            goto Lc0
        L10:
            java.lang.String r0 = "SETTINGS_HEADER_ID"
            r1 = 0
            int r0 = r4.getIntExtra(r0, r1)
            java.lang.String r3 = "PREFERENCE_FRAGMENT"
            java.lang.String r5 = r4.getStringExtra(r3)
            java.lang.String r6 = ":settings:fragment_args_key"
            java.lang.String r6 = r4.getStringExtra(r6)
            r7 = 0
            if (r0 != 0) goto L34
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L33
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L33
            goto L8c
        L33:
            r0 = 0
        L34:
            int r8 = r9.hr()
            r9.aY(r8)
            java.lang.Integer r0 = r2.o(r0)
            if (r0 == 0) goto L4a
            int r0 = r0.intValue()
            java.lang.Object r0 = r9.g(r0)
            goto L62
        L4a:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L61
            java.lang.String r0 = ">"
            java.lang.String[] r0 = r6.split(r0)
            int r6 = r0.length
            r8 = 1
            if (r6 <= r8) goto L61
            r0 = r0[r1]
            androidx.preference.Preference r0 = r9.hs(r0)
            goto L62
        L61:
            r0 = r7
        L62:
            if (r0 != 0) goto L8b
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L8c
            androidx.preference.PreferenceScreen r0 = r9.fL()
        L6e:
            int r6 = r0.k()
            if (r1 >= r6) goto L8c
            androidx.preference.Preference r6 = r0.o(r1)
            android.os.Bundle r8 = r6.w
            if (r8 == 0) goto L88
            java.lang.String r8 = r8.getString(r3)
            boolean r8 = r5.equals(r8)
            if (r8 == 0) goto L88
            r7 = r6
            goto L8c
        L88:
            int r1 = r1 + 1
            goto L6e
        L8b:
            r7 = r0
        L8c:
            if (r7 == 0) goto L9d
            gyc r10 = defpackage.gyc.b
            epv r11 = new epv
            androidx.preference.Preference r7 = (androidx.preference.Preference) r7
            r0 = 13
            r11.<init>(r9, r2, r7, r0)
            r10.hP(r11)
            goto Lb6
        L9d:
            java.lang.String r0 = ":android:show_fragment"
            java.lang.String r3 = r4.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Lc0
            gyc r10 = defpackage.gyc.b
            bvr r11 = new bvr
            r5 = 2
            r0 = r11
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r10.hP(r11)
        Lb6:
            androidx.preference.PreferenceScreen r10 = r9.fL()
            if (r10 == 0) goto Lbf
            r10.ae()
        Lbf:
            return
        Lc0:
            super.o(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iny.o(android.os.Bundle, java.lang.String):void");
    }
}
