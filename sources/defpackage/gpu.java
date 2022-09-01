package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.media.AudioManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: gpu  reason: default package */
/* loaded from: classes.dex */
public final class gpu implements gqc {
    public final gqd a = new gqd();
    private final gqa c;

    public gpu(Context context) {
        this.c = gqa.a(context);
    }

    @Override // defpackage.gqc
    public final CharSequence a(CharSequence charSequence) {
        return this.c.d(charSequence);
    }

    @Override // defpackage.gqc
    public final void c(CharSequence charSequence) {
        this.c.f(charSequence);
    }

    @Override // defpackage.gqc
    public final void d(int i, Object... objArr) {
        this.c.g(i, objArr);
    }

    @Override // defpackage.gqc
    public final void e(int i) {
        this.c.h(i);
    }

    @Override // defpackage.gqc
    public final void f(CharSequence charSequence) {
        this.c.i(charSequence);
    }

    @Override // defpackage.gqc
    public final void g(CharSequence charSequence) {
        this.c.k(charSequence);
    }

    @Override // defpackage.gqc
    public final void h(CharSequence charSequence) {
        this.c.m(charSequence);
    }

    @Override // defpackage.gqc
    public final void i(View view) {
        gqa.y(view);
    }

    @Override // defpackage.gqc
    public final void j(View view) {
        this.c.o(view);
    }

    @Override // defpackage.gqc
    public final void k(View view) {
        if (!this.c.g || view == null) {
            return;
        }
        view.sendAccessibilityEvent(256);
    }

    @Override // defpackage.gqc
    public final boolean l() {
        return this.c.f;
    }

    @Override // defpackage.gqc
    public final boolean m() {
        return this.c.g;
    }

    @Override // defpackage.gqc
    public final boolean n() {
        return li.f() && ((Boolean) gqa.b.c()).booleanValue();
    }

    @Override // defpackage.gqc
    public final boolean o() {
        return this.c.e;
    }

    @Override // defpackage.gqc
    public final boolean p() {
        gqa gqaVar = this.c;
        return ham.K(gqaVar.i) && !((AudioManager) gqaVar.h.a()).isWiredHeadsetOn() && !((AudioManager) gqaVar.h.a()).isBluetoothA2dpOn() && Settings.Secure.getInt(gqaVar.d.getContentResolver(), "speak_password", 0) == 0;
    }

    @Override // defpackage.gqc
    public final boolean q() {
        return this.c.x();
    }

    @Override // defpackage.gqc
    public final void r() {
        this.c.j(R.string.f188150_resource_name_obfuscated_res_0x7f1411a9);
    }

    @Override // defpackage.gqc
    public final void s(int... iArr) {
        this.c.n(R.string.f166330_resource_name_obfuscated_res_0x7f1408cf, iArr);
    }

    @Override // defpackage.gqc
    public final String t(int i) {
        gqd gqdVar = this.a;
        Resources resources = gqdVar.a;
        if (i == 0 || resources == null) {
            return null;
        }
        if (gqdVar.c == null) {
            TypedArray obtainTypedArray = resources.obtainTypedArray(R.array.f1500_resource_name_obfuscated_res_0x7f030033);
            SparseIntArray sparseIntArray = new SparseIntArray();
            for (int i2 = 0; i2 < obtainTypedArray.length(); i2 += 2) {
                sparseIntArray.put(obtainTypedArray.getResourceId(i2, 0), obtainTypedArray.getResourceId(i2 + 1, 0));
            }
            obtainTypedArray.recycle();
            gqdVar.c = sparseIntArray;
        }
        int i3 = gqdVar.c.get(i);
        if (i3 == 0) {
            return null;
        }
        return resources.getString(i3);
    }

    @Override // defpackage.gqc
    public final CharSequence b(CharSequence charSequence, CharSequence charSequence2) {
        gqd gqdVar = this.a;
        String str = null;
        String obj = charSequence == null ? null : charSequence.toString();
        if (charSequence2 != null) {
            str = charSequence2.toString();
        }
        if (obj == null || str != null) {
            obj = str;
        } else {
            Resources resources = gqdVar.a;
            if (resources != null) {
                if (gqdVar.b == null) {
                    TypedArray obtainTypedArray = resources.obtainTypedArray(R.array.f1140_resource_name_obfuscated_res_0x7f03000c);
                    HashMap hashMap = new HashMap();
                    for (int i = 0; i < obtainTypedArray.length(); i += 2) {
                        TypedValue typedValue = new TypedValue();
                        obtainTypedArray.getValue(i + 1, typedValue);
                        hashMap.put(obtainTypedArray.getString(i), typedValue);
                    }
                    obtainTypedArray.recycle();
                    gqdVar.b = hashMap;
                }
                TypedValue typedValue2 = (TypedValue) gqdVar.b.get(obj);
                if (typedValue2 != null) {
                    if (typedValue2.resourceId != 0) {
                        obj = resources.getString(typedValue2.resourceId);
                    } else if (typedValue2.string != null) {
                        obj = typedValue2.string.toString();
                    }
                }
                TypedValue typedValue3 = (TypedValue) gqdVar.b.get(obj.toLowerCase(Locale.US));
                if (typedValue3 != null) {
                    if (typedValue3.resourceId != 0) {
                        obj = resources.getString(R.string.f182180_resource_name_obfuscated_res_0x7f140f2d, resources.getString(typedValue3.resourceId));
                    } else if (typedValue3.string != null) {
                        obj = typedValue3.string.toString();
                    }
                }
            }
        }
        return TextUtils.isEmpty(obj) ? "" : this.c.d(obj);
    }
}
