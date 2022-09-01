package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import com.google.android.inputmethod.latin.R;
import j$.util.Collection$EL;
import j$.util.Objects;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: eyq  reason: default package */
/* loaded from: classes.dex */
public final class eyq extends ls {
    private static final ltg g = ltg.j("com/google/android/apps/inputmethod/libs/translate/LanguageListAdapterV2");
    public final eyw d;
    public String e;
    public Runnable f;
    private final Context h;
    private final Map i;
    private final ArrayList j = new ArrayList();
    private final leq k;

    public eyq(Context context, Map map, List list, String str, leq leqVar) {
        this.h = context;
        this.k = leqVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        this.i = linkedHashMap;
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (linkedHashMap.containsKey(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        eyw eywVar = new eyw(arrayList);
        this.d = eywVar;
        if (this.i.isEmpty()) {
            ((ltd) ((ltd) g.c()).k("com/google/android/apps/inputmethod/libs/translate/LanguageListAdapterV2", "<init>", 73, "LanguageListAdapterV2.java")).t("No language added into list adapter.");
            return;
        }
        if (TextUtils.isEmpty(str) || !this.i.containsKey(str)) {
            if (!eywVar.g()) {
                this.e = (String) eywVar.c();
            } else {
                String str3 = (String) this.i.keySet().iterator().next();
                this.e = str3;
                if (!TextUtils.isEmpty(str3)) {
                    eywVar.f(this.e);
                }
            }
        } else {
            this.e = str;
            eywVar.f(str);
        }
        if (!eywVar.g()) {
            this.j.addAll(eywVar.d());
        }
        this.j.add("____________");
        Stream filter = Collection$EL.stream(this.i.keySet()).filter(new cjx(this, 15));
        ArrayList arrayList2 = this.j;
        Objects.requireNonNull(arrayList2);
        filter.forEach(new chf(arrayList2, 14));
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ mo d(ViewGroup viewGroup, int i) {
        return new eyp(LayoutInflater.from(this.h).inflate(R.layout.f142700_resource_name_obfuscated_res_0x7f0e0415, viewGroup, false));
    }

    @Override // defpackage.ls
    public final int ha() {
        return this.j.size();
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ void o(mo moVar, int i) {
        View view;
        eyp eypVar = (eyp) moVar;
        String str = (String) this.j.get(i);
        boolean equals = "____________".equals(str);
        int i2 = eyp.v;
        RadioButton radioButton = eypVar.u;
        if (radioButton == null || eypVar.t == null || (view = eypVar.s) == null) {
            return;
        }
        int i3 = 0;
        if (!equals) {
            view.setVisibility(8);
            eypVar.u.setVisibility(0);
            eypVar.u.setText((CharSequence) this.i.get(str));
            eypVar.u.setChecked(TextUtils.equals(str, this.e));
            eypVar.u.requestLayout();
            eypVar.u.setOnClickListener(new eiz(this, str, 18));
            if (eypVar.t == null) {
                return;
            }
            boolean booleanValue = ((Boolean) this.k.a(str)).booleanValue();
            boolean equals2 = str.equals("auto");
            ImageView imageView = eypVar.t;
            if (!booleanValue && !equals2) {
                i3 = 4;
            }
            imageView.setVisibility(i3);
            if (booleanValue) {
                eypVar.t.setImageResource(R.drawable.f46820_resource_name_obfuscated_res_0x7f080192);
                return;
            } else if (!equals2) {
                return;
            } else {
                eypVar.t.setImageResource(R.drawable.f50090_resource_name_obfuscated_res_0x7f08032c);
                return;
            }
        }
        radioButton.setVisibility(8);
        eypVar.u.setOnClickListener(null);
        eypVar.t.setVisibility(8);
        eypVar.s.setVisibility(0);
    }
}
