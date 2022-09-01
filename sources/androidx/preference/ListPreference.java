package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    private String K;
    private boolean L;
    public CharSequence[] g;
    public CharSequence[] h;
    public String i;

    public ListPreference(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final Parcelable e() {
        Parcelable e = super.e();
        if (this.x) {
            return e;
        }
        ahn ahnVar = new ahn(e);
        ahnVar.a = this.i;
        return ahnVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(ahn.class)) {
            super.g(parcelable);
            return;
        }
        ahn ahnVar = (ahn) parcelable;
        super.g(ahnVar.getSuperState());
        o(ahnVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        o(u((String) obj));
    }

    public final int k(String str) {
        CharSequence[] charSequenceArr;
        if (str != null && (charSequenceArr = this.h) != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(this.h[length].toString(), str)) {
                    return length;
                }
            }
        }
        return -1;
    }

    public final CharSequence l() {
        CharSequence[] charSequenceArr;
        int k = k(this.i);
        if (k < 0 || (charSequenceArr = this.g) == null) {
            return null;
        }
        return charSequenceArr[k];
    }

    @Override // androidx.preference.Preference
    public final CharSequence m() {
        ahy ahyVar = this.J;
        if (ahyVar != null) {
            return ahyVar.a(this);
        }
        CharSequence l = l();
        CharSequence m = super.m();
        String str = this.K;
        if (str == null) {
            return m;
        }
        Object[] objArr = new Object[1];
        if (l == null) {
            l = "";
        }
        objArr[0] = l;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, m)) {
            return m;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    @Override // androidx.preference.Preference
    public final void n(CharSequence charSequence) {
        super.n(charSequence);
        if (charSequence == null) {
            this.K = null;
        } else {
            this.K = charSequence.toString();
        }
    }

    public final void o(String str) {
        boolean z = !TextUtils.equals(this.i, str);
        if (z || !this.L) {
            this.i = str;
            this.L = true;
            ab(str);
            if (!z) {
                return;
            }
            d();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, jn.d(context, R.attr.f10800_resource_name_obfuscated_res_0x7f0403b4, 16842897));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ait.e, i, i2);
        this.g = jn.m(obtainStyledAttributes, 2, 0);
        this.h = jn.m(obtainStyledAttributes, 3, 1);
        if (jn.k(obtainStyledAttributes, 4, 4, false)) {
            if (aho.a == null) {
                aho.a = new aho(0);
            }
            O(aho.a);
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ait.g, i, i2);
        this.K = jn.j(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }
}
