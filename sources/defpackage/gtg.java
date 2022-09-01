package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: gtg  reason: default package */
/* loaded from: classes.dex */
public final class gtg {
    public jdr a;
    public gqc b;
    private final Context d;
    private final int e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final ico i = ict.d();
    private final iaj j = ial.c();
    private final SparseArray k = new SparseArray();
    public float c = 1.0f;

    public gtg(Context context, int i, int i2) {
        this.d = context;
        this.e = i;
        this.f = i2;
        View inflate = LayoutInflater.from(context).inflate(i2, new SoftKeyView(context));
        boolean z = true;
        this.g = (inflate == null || inflate.findViewById(R.id.f56210_resource_name_obfuscated_res_0x7f0b0265) == null) ? false : true;
        this.h = (inflate == null || inflate.findViewById(R.id.f65200_resource_name_obfuscated_res_0x7f0b0745) == null) ? false : z;
    }

    public final ict a(gqh gqhVar, boolean z, boolean z2) {
        int i;
        int i2;
        int hashCode = Arrays.hashCode(new Object[]{gqhVar, Boolean.valueOf(z), Boolean.valueOf(z2)});
        ict ictVar = (ict) this.k.get(hashCode);
        if (ictVar == null) {
            ico icoVar = this.i;
            icoVar.v();
            icoVar.x = true;
            icoVar.n = this.f;
            int i3 = gqhVar.d;
            if (i3 != 0) {
                this.i.h = this.d.getString(i3);
            }
            int i4 = true != z ? -40003 : -40002;
            iaj iajVar = this.j;
            iajVar.k();
            iajVar.b = iah.PRESS;
            iajVar.n(i4, null, gqhVar);
            this.i.p(this.j.b());
            if (z2) {
                iaj iajVar2 = this.j;
                iajVar2.k();
                iajVar2.b = iah.LONG_PRESS;
                iajVar2.n(-40004, null, gqhVar.a);
                iajVar2.f = true;
                iajVar2.b();
                this.i.p(this.j.b());
            }
            if (this.g && (i2 = gqhVar.b) != 0) {
                this.i.s(R.id.f56210_resource_name_obfuscated_res_0x7f0b0265, jgd.g(this.d, i2));
            }
            if (this.h && (i = gqhVar.c) != 0) {
                this.i.f(R.id.f65200_resource_name_obfuscated_res_0x7f0b0745, this.d.getString(i));
            }
            ict c = this.i.c();
            this.k.put(hashCode, c);
            return c;
        }
        return ictVar;
    }

    public final SoftKeyView b(ViewGroup viewGroup) {
        SoftKeyView softKeyView = (SoftKeyView) LayoutInflater.from(this.d).inflate(this.e, viewGroup, false);
        softKeyView.j(this.a);
        softKeyView.i(this.b);
        softKeyView.k(this.c);
        return softKeyView;
    }

    public gtg(Context context, AttributeSet attributeSet) {
        TypedArray typedArray;
        this.d = context;
        boolean z = false;
        if (attributeSet != null) {
            try {
                typedArray = context.obtainStyledAttributes(attributeSet, gtn.b, 0, 0);
                try {
                    this.e = typedArray.getResourceId(0, 0);
                    int resourceId = typedArray.getResourceId(2, 0);
                    this.f = resourceId;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    View inflate = LayoutInflater.from(context).inflate(resourceId, new SoftKeyView(context));
                    this.g = (inflate == null || inflate.findViewById(R.id.f56210_resource_name_obfuscated_res_0x7f0b0265) == null) ? false : true;
                    if (inflate != null && inflate.findViewById(R.id.f65200_resource_name_obfuscated_res_0x7f0b0745) != null) {
                        z = true;
                    }
                    this.h = z;
                } catch (Throwable th) {
                    th = th;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                typedArray = null;
            }
        } else {
            this.e = 0;
            this.f = 0;
            this.g = false;
            this.h = false;
        }
    }
}
