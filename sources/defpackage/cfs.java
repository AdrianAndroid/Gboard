package defpackage;

import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;
import java.util.List;

/* compiled from: PG */
/* renamed from: cfs  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cfs implements hle {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cfs(View.OnClickListener onClickListener, int i) {
        this.b = i;
        this.a = onClickListener;
    }

    public /* synthetic */ cfs(bsy bsyVar, int i) {
        this.b = i;
        this.a = bsyVar;
    }

    public /* synthetic */ cfs(cfz cfzVar, int i) {
        this.b = i;
        this.a = cfzVar;
    }

    public /* synthetic */ cfs(dwq dwqVar, int i) {
        this.b = i;
        this.a = dwqVar;
    }

    public /* synthetic */ cfs(eov eovVar, int i) {
        this.b = i;
        this.a = eovVar;
    }

    public /* synthetic */ cfs(ifm ifmVar, int i) {
        this.b = i;
        this.a = ifmVar;
    }

    public /* synthetic */ cfs(String str, int i) {
        this.b = i;
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [dwk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // defpackage.hle
    public final void a(View view) {
        String string;
        int i = this.b;
        if (i == 0) {
            view.findViewById(R.id.f53930_resource_name_obfuscated_res_0x7f0b015b).setOnClickListener(new hk((cfz) this.a, 19));
        } else if (i == 1) {
            bsy bsyVar = (bsy) this.a;
            if (bsyVar.d == null) {
                return;
            }
            View findViewById = view.findViewById(R.id.f66820_resource_name_obfuscated_res_0x7f0b0818);
            String concat = "showcount_".concat(String.valueOf(bsyVar.d));
            if (findViewById != null) {
                findViewById.setOnClickListener(new bsx(bsyVar, concat, 1));
            }
            View findViewById2 = view.findViewById(R.id.f66700_resource_name_obfuscated_res_0x7f0b0808);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new bsx(bsyVar, concat, 0));
            }
            TextView textView = (TextView) view.findViewById(R.id.f65200_resource_name_obfuscated_res_0x7f0b0745);
            if (textView == null) {
                return;
            }
            String string2 = textView.getContext().getString(R.string.f148260_resource_name_obfuscated_res_0x7f14006d, jav.e(bsyVar.d).m(textView.getContext()));
            textView.setText(string2);
            textView.setContentDescription(string2);
        } else if (i == 2) {
            ?? r0 = this.a;
            dwq dwqVar = (dwq) r0;
            dwj dwjVar = dwqVar.b;
            if (dwjVar == 0) {
                return;
            }
            dwqVar.c = view;
            dwjVar.c(r0, view, dwqVar.a);
        } else if (i == 3) {
            Object obj = this.a;
            View findViewById3 = view.findViewById(R.id.f54070_resource_name_obfuscated_res_0x7f0b0179);
            if (findViewById3 != null) {
                findViewById3.setOnClickListener(new edc((eov) obj, 14));
            }
            View findViewById4 = view.findViewById(R.id.f54050_resource_name_obfuscated_res_0x7f0b0177);
            if (findViewById4 != null) {
                findViewById4.setOnClickListener(new edc((eov) obj, 15));
            }
            eov eovVar = (eov) obj;
            List list = eovVar.c.b;
            CharSequence charSequence = null;
            CharSequence charSequence2 = null;
            CharSequence charSequence3 = null;
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (i2 == 0) {
                    charSequence3 = (CharSequence) list.get(0);
                } else if (i2 == 1) {
                    charSequence2 = (CharSequence) list.get(1);
                } else {
                    charSequence = (CharSequence) list.get(i2);
                }
            }
            if (charSequence != null) {
                string = eovVar.b.getString(R.string.f176540_resource_name_obfuscated_res_0x7f140cdf, charSequence3, charSequence2, charSequence);
            } else if (charSequence2 != null) {
                string = eovVar.b.getString(R.string.f176980_resource_name_obfuscated_res_0x7f140d13, charSequence3, charSequence2);
            } else {
                string = charSequence3 != null ? eovVar.b.getString(R.string.f159310_resource_name_obfuscated_res_0x7f1405bb, charSequence3) : "";
            }
            ((TextView) view.findViewById(R.id.f54060_resource_name_obfuscated_res_0x7f0b0178)).setText(string);
        } else if (i == 4) {
            ?? r02 = this.a;
            if (r02 == 0) {
                return;
            }
            ((AppCompatTextView) view.findViewById(R.id.f130000_resource_name_obfuscated_res_0x7f0b21ae)).setText((CharSequence) r02);
        } else if (i == 5) {
            Object obj2 = this.a;
            View findViewById5 = view.findViewById(R.id.f68630_resource_name_obfuscated_res_0x7f0b0900);
            if (findViewById5 != null) {
                findViewById5.setOnClickListener(new hwd((ifm) obj2, 2));
            }
            View findViewById6 = view.findViewById(R.id.f68650_resource_name_obfuscated_res_0x7f0b0902);
            if (findViewById6 != null) {
                findViewById6.setOnClickListener(new hwd(view, 3));
            }
            View findViewById7 = view.findViewById(R.id.f68640_resource_name_obfuscated_res_0x7f0b0901);
            if (findViewById7 != null) {
                findViewById7.setOnClickListener(bwk.m);
            }
            View findViewById8 = view.findViewById(R.id.f68660_resource_name_obfuscated_res_0x7f0b0903);
            if (findViewById8 != null) {
                findViewById8.setOnClickListener(new hwd((ifm) obj2, 4));
            }
            hrx.y(view.getContext());
            hqt b = hqp.b();
            if (b == null) {
                return;
            }
            view.setLayoutDirection(b.v() ? 1 : 0);
        } else {
            view.findViewById(R.id.f66740_resource_name_obfuscated_res_0x7f0b080d).setOnClickListener(this.a);
        }
    }
}
