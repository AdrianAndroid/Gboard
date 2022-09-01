package com.google.android.apps.inputmethod.libs.preferencewidgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import com.google.android.apps.inputmethod.libs.preferencewidgets.SeekBarListPreference;
import j$.util.Objects;
import j$.util.function.IntPredicate;
import j$.util.stream.IntStream;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SeekBarListPreference extends SeekBarDialogPreference {
    public final llp K;
    private final List M;

    public SeekBarListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        CharSequence[] an = an(context, attributeSet, 16843256);
        if (an != null) {
            this.K = llp.p(an);
            CharSequence[] an2 = an(context, attributeSet, 16842930);
            if (an2 != null) {
                this.M = Arrays.asList(an2);
            } else {
                this.M = null;
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843241});
            final CharSequence text = obtainStyledAttributes.getText(0);
            obtainStyledAttributes.recycle();
            O(new ahy() { // from class: dyd
                @Override // defpackage.ahy
                public final CharSequence a(Preference preference) {
                    CharSequence charSequence = text;
                    SeekBarListPreference seekBarListPreference = (SeekBarListPreference) preference;
                    if (TextUtils.isEmpty(charSequence)) {
                        return seekBarListPreference.ah();
                    }
                    String valueOf = String.valueOf(charSequence);
                    String ah = seekBarListPreference.ah();
                    return valueOf + " : " + ah;
                }
            });
            return;
        }
        throw new IllegalStateException("SeekBarListPreference requires an entryValues array.");
    }

    private final int am(final String str) {
        int orElse = IntStream.CC.range(0, ((lrl) this.K).c).filter(new IntPredicate() { // from class: dyc
            @Override // j$.util.function.IntPredicate
            public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                return Objects.requireNonNull(intPredicate);
            }

            @Override // j$.util.function.IntPredicate
            /* renamed from: negate */
            public final /* synthetic */ IntPredicate mo33negate() {
                return IntPredicate.CC.$default$negate(this);
            }

            @Override // j$.util.function.IntPredicate
            public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                return Objects.requireNonNull(intPredicate);
            }

            @Override // j$.util.function.IntPredicate
            public final boolean test(int i) {
                return str.contentEquals((CharSequence) SeekBarListPreference.this.K.get(i));
            }
        }).findFirst().orElse(-1);
        return orElse != -1 ? orElse : ((lrl) this.K).c / 2;
    }

    private static CharSequence[] an(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{i});
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(0);
        obtainStyledAttributes.recycle();
        return textArray;
    }

    @Override // com.google.android.apps.inputmethod.libs.preferencewidgets.SeekBarDialogPreference
    protected final Object af(int i) {
        llp llpVar = this.K;
        if (i < ((lrl) llpVar).c) {
            return ((CharSequence) llpVar.get(i)).toString();
        }
        return null;
    }

    @Override // com.google.android.apps.inputmethod.libs.preferencewidgets.SeekBarDialogPreference
    public final String ag(int i) {
        List list = this.M;
        if (list == null || i >= list.size()) {
            return super.ag(i);
        }
        return ((CharSequence) this.M.get(i)).toString();
    }

    public final String ah() {
        return ag(am(al()));
    }

    public final String al() {
        return u("");
    }

    @Override // com.google.android.apps.inputmethod.libs.preferencewidgets.SeekBarDialogPreference, com.google.android.libraries.inputmethod.preferencewidgets.DialogPreferenceCompat
    public final void k(View view) {
        super.k(view);
        this.i.setMax(((lrl) this.K).c - 1);
        ak(am(al()));
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.DialogPreferenceCompat
    public final void l(boolean z) {
        Object af = af(ai());
        if (!z || af == null || !U(af)) {
            return;
        }
        ab((String) af);
        d();
    }
}
