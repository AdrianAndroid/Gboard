package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: hcl  reason: default package */
/* loaded from: classes.dex */
public final class hcl extends ls {
    public int d = -1;
    public final opu e;
    private final int[] f;
    private final String[] g;
    private final LayoutInflater h;
    private final Context i;
    private final gqa j;
    private final hcm k;

    public hcl(Context context, opu opuVar, llp llpVar, hcm hcmVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.i = context;
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(R.array.f1250_resource_name_obfuscated_res_0x7f030017);
        lrl lrlVar = (lrl) llpVar;
        int[] iArr = new int[obtainTypedArray.length() + lrlVar.c];
        int i = 0;
        int i2 = 0;
        while (i2 < obtainTypedArray.length()) {
            iArr[i2] = obtainTypedArray.getResourceId(i2, 0);
            i2++;
        }
        obtainTypedArray.recycle();
        int i3 = lrlVar.c;
        int i4 = 0;
        while (i4 < i3) {
            iArr[i2] = ((hbk) llpVar.get(i4)).a();
            i4++;
            i2++;
        }
        this.f = iArr;
        TypedArray obtainTypedArray2 = context.getResources().obtainTypedArray(R.array.f1240_resource_name_obfuscated_res_0x7f030016);
        String[] strArr = new String[obtainTypedArray2.length() + lrlVar.c];
        int i5 = 0;
        while (i5 < obtainTypedArray2.length()) {
            strArr[i5] = context.getString(obtainTypedArray2.getResourceId(i5, 0));
            i5++;
        }
        obtainTypedArray2.recycle();
        int i6 = lrlVar.c;
        while (i < i6) {
            strArr[i5] = ((hbk) llpVar.get(i)).b();
            i++;
            i5++;
        }
        this.g = strArr;
        this.e = opuVar;
        this.j = gqa.a(context);
        this.k = hcmVar;
        this.h = LayoutInflater.from(context);
    }

    @Override // defpackage.ls
    public final mo d(ViewGroup viewGroup, int i) {
        return new mo(this.h.inflate(this.k.a == 1 ? R.layout.f134900_resource_name_obfuscated_res_0x7f0e00d0 : R.layout.f134910_resource_name_obfuscated_res_0x7f0e00d1, viewGroup, false));
    }

    @Override // defpackage.ls
    public final int ha() {
        return this.f.length;
    }

    @Override // defpackage.ls
    public final void o(mo moVar, int i) {
        moVar.a.setOnClickListener(new dxk(this, i, 2));
        ImageView imageView = (ImageView) moVar.a.findViewById(R.id.f54210_resource_name_obfuscated_res_0x7f0b0189);
        imageView.setImageDrawable(this.i.getDrawable(this.f[i]));
        gqa.q(imageView, this.g[i]);
        TextView textView = (TextView) moVar.a.findViewById(R.id.f54220_resource_name_obfuscated_res_0x7f0b018a);
        if (textView != null) {
            textView.setText(this.g[i]);
        }
        View findViewById = moVar.a.findViewById(R.id.f54230_resource_name_obfuscated_res_0x7f0b018b);
        if (i != this.d) {
            if (textView != null) {
                moVar.a.setSelected(false);
            } else {
                imageView.setSelected(false);
            }
            if (findViewById == null) {
                return;
            }
            findViewById.setVisibility(8);
            findViewById.setSelected(false);
            return;
        }
        this.j.k(imageView.getContentDescription());
        if (textView != null) {
            moVar.a.setSelected(true);
        } else {
            imageView.setSelected(true);
        }
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(0);
        findViewById.setSelected(true);
    }
}
