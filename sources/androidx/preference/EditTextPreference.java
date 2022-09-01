package androidx.preference;

import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969563(0x7f0403db, float:1.7547811E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = defpackage.jn.d(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            int[] r2 = defpackage.ait.d
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            boolean r5 = defpackage.jn.k(r4, r1, r1, r1)
            if (r5 == 0) goto L2b
            aho r5 = defpackage.aho.b
            if (r5 != 0) goto L26
            aho r5 = new aho
            r0 = 1
            r5.<init>(r0)
            defpackage.aho.b = r5
        L26:
            aho r5 = defpackage.aho.b
            r3.O(r5)
        L2b:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final Parcelable e() {
        Parcelable e = super.e();
        if (this.x) {
            return e;
        }
        ahk ahkVar = new ahk(e);
        ahkVar.a = this.g;
        return ahkVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(ahk.class)) {
            super.g(parcelable);
            return;
        }
        ahk ahkVar = (ahk) parcelable;
        super.g(ahkVar.getSuperState());
        i(ahkVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        i(u((String) obj));
    }

    public final void i(String str) {
        boolean j = j();
        this.g = str;
        ab(str);
        boolean j2 = j();
        if (j2 != j) {
            z(j2);
        }
        d();
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return TextUtils.isEmpty(this.g) || super.j();
    }
}
