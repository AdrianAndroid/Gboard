package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final aix c = new aix(this, 1);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CheckBoxPreference(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r0 = 2130969288(0x7f0402c8, float:1.7547254E38)
            r1 = 16842895(0x101008f, float:2.369396E-38)
            int r0 = defpackage.jn.d(r5, r0, r1)
            r1 = 0
            r4.<init>(r5, r6, r0, r1)
            aix r2 = new aix
            r3 = 1
            r2.<init>(r4, r3)
            r4.c = r2
            int[] r2 = defpackage.ait.b
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r2, r0, r1)
            r6 = 5
            java.lang.String r6 = defpackage.jn.j(r5, r6, r1)
            r4.o(r6)
            r6 = 4
            java.lang.String r6 = defpackage.jn.j(r5, r6, r3)
            r4.l(r6)
            r6 = 3
            r0 = 2
            boolean r6 = defpackage.jn.k(r5, r6, r0, r1)
            r4.b = r6
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.CheckBoxPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private final void ag(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(ais aisVar) {
        super.a(aisVar);
        ag(aisVar.F(16908289));
        af(aisVar);
    }

    @Override // androidx.preference.Preference
    public final void hq(View view) {
        G();
        if (!((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        ag(view.findViewById(16908289));
        ae(view.findViewById(16908304));
    }
}
