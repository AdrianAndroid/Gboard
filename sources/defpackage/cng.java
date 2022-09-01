package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: cng  reason: default package */
/* loaded from: classes.dex */
public final class cng {
    private static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/expression/errorcard/ErrorCard");
    public final int a;
    public final int b;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    private final Runnable h;

    public cng() {
    }

    public cng(int i, int i2, int i3, int i4, int i5, boolean z, Runnable runnable) {
        this.a = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.b = i5;
        this.g = z;
        this.h = runnable;
    }

    public static cnf a() {
        cnf cnfVar = new cnf();
        cnfVar.h(0);
        cnfVar.g(0);
        cnfVar.f(0);
        cnfVar.d(0);
        cnfVar.c(true);
        return cnfVar;
    }

    public final void b(Context context, ViewGroup viewGroup) {
        c(context, dbf.a(context), context.getResources(), viewGroup);
    }

    public final void c(Context context, LayoutInflater layoutInflater, Resources resources, ViewGroup viewGroup) {
        int i;
        int i2;
        viewGroup.removeAllViews();
        ((ltd) ((ltd) c.b()).k("com/google/android/apps/inputmethod/libs/expression/errorcard/ErrorCard", "inflate", 96, "ErrorCard.java")).u("Error encountered: %d", this.a);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(this.d, viewGroup, true);
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.f54420_resource_name_obfuscated_res_0x7f0b01a0);
        if (imageView != null && (i2 = this.e) != 0) {
            imageView.setImageResource(i2);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewGroup2.findViewById(R.id.f54430_resource_name_obfuscated_res_0x7f0b01a1);
        if (appCompatTextView != null && (i = this.f) != 0) {
            gqa.s(appCompatTextView, resources.getString(i));
        }
        Button button = (Button) viewGroup.findViewById(R.id.f54400_resource_name_obfuscated_res_0x7f0b019e);
        if (button != null) {
            int i3 = this.b;
            if (i3 != 0) {
                gqa.s(button, resources.getString(i3));
            }
            Runnable runnable = this.h;
            if (runnable != null) {
                button.setVisibility(0);
                button.setOnClickListener(new dbg(new cjr(runnable, 4), 0));
            }
        }
        if (this.g) {
            Resources resources2 = context.getResources();
            gqa a = gqa.a(context);
            Object[] objArr = new Object[1];
            int i4 = this.a;
            objArr[0] = resources2.getString(i4 != 1 ? i4 != 2 ? R.string.f148310_resource_name_obfuscated_res_0x7f14008f : R.string.f158680_resource_name_obfuscated_res_0x7f14056a : R.string.f159020_resource_name_obfuscated_res_0x7f140597);
            a.i(resources2.getString(R.string.f151680_resource_name_obfuscated_res_0x7f140223, objArr));
            int i5 = this.f;
            if (i5 == 0) {
                return;
            }
            a.h(i5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cng) {
            cng cngVar = (cng) obj;
            if (this.a == cngVar.a && this.d == cngVar.d && this.e == cngVar.e && this.f == cngVar.f && this.b == cngVar.b && this.g == cngVar.g) {
                Runnable runnable = this.h;
                Runnable runnable2 = cngVar.h;
                if (runnable != null ? runnable.equals(runnable2) : runnable2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((((((this.a ^ 1000003) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.b) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        Runnable runnable = this.h;
        return i ^ (runnable == null ? 0 : runnable.hashCode());
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.e;
        int i4 = this.f;
        int i5 = this.b;
        boolean z = this.g;
        String valueOf = String.valueOf(this.h);
        return "ErrorCard{cardType=" + i + ", layout=" + i2 + ", icon=" + i3 + ", errorMessage=" + i4 + ", buttonMessage=" + i5 + ", announceOnInflate=" + z + ", onClickAction=" + valueOf + "}";
    }
}
