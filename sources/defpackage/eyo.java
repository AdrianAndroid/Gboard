package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: eyo  reason: default package */
/* loaded from: classes.dex */
public final class eyo extends ArrayAdapter {
    private static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/translate/LanguageListAdapter");
    public String a;
    public Runnable b;
    private final Context d;
    private final Map e;
    private final eyw f;

    public eyo(Context context, Map map, List list, String str) {
        super(context, R.layout.f142690_resource_name_obfuscated_res_0x7f0e0414);
        this.d = context;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        this.e = linkedHashMap;
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
        this.f = eywVar;
        if (this.e.isEmpty()) {
            ((ltd) ((ltd) c.c()).k("com/google/android/apps/inputmethod/libs/translate/LanguageListAdapter", "<init>", 54, "LanguageListAdapter.java")).t("No language added into list adapter.");
        } else if (TextUtils.isEmpty(str) || !this.e.containsKey(str)) {
            if (!eywVar.g()) {
                this.a = (String) eywVar.c();
                return;
            }
            String str3 = (String) this.e.keySet().iterator().next();
            this.a = str3;
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            eywVar.f(this.a);
        } else {
            this.a = str;
            eywVar.f(str);
        }
    }

    private final boolean c(String str) {
        return this.f.a(str) >= 0;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: a */
    public final String getItem(int i) {
        if (i < this.f.b()) {
            return (String) this.f.a.get(i);
        }
        String str = (String) super.getItem(i - this.f.b());
        return TextUtils.isEmpty(str) ? "" : str;
    }

    @Override // android.widget.ArrayAdapter
    public final void addAll(Collection collection) {
        setNotifyOnChange(false);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            add((String) it.next());
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.ArrayAdapter
    /* renamed from: b */
    public final void add(String str) {
        if (!c(str)) {
            super.add(str);
        }
    }

    @Override // android.widget.ArrayAdapter
    public final void clear() {
        super.clear();
        this.f.e();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return super.getCount() + this.f.b();
    }

    @Override // android.widget.ArrayAdapter
    public final /* bridge */ /* synthetic */ int getPosition(Object obj) {
        String str = (String) obj;
        int a = this.f.a(str);
        return a >= 0 ? a : super.getPosition(str) + this.f.b();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.d.getSystemService("layout_inflater")).inflate(R.layout.f142690_resource_name_obfuscated_res_0x7f0e0414, (ViewGroup) null, true);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.f130120_resource_name_obfuscated_res_0x7f0b21c3);
        if (i + 1 == this.f.b()) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        String item = getItem(i);
        RadioButton radioButton = (RadioButton) view.findViewById(R.id.f130110_resource_name_obfuscated_res_0x7f0b21c2);
        radioButton.setText((CharSequence) this.e.get(item));
        radioButton.setChecked(TextUtils.equals(item, this.a));
        radioButton.setTag(item);
        radioButton.setOnClickListener(new fat(this, 1));
        return view;
    }

    @Override // android.widget.ArrayAdapter
    public final /* bridge */ /* synthetic */ void insert(Object obj, int i) {
        String str = (String) obj;
        if (i >= this.f.b()) {
            super.insert(str, i - this.f.b());
        } else {
            ((ltd) ((ltd) c.c()).k("com/google/android/apps/inputmethod/libs/translate/LanguageListAdapter", "insert", 182, "LanguageListAdapter.java")).t("Directly insert into recent list refused.");
        }
    }

    @Override // android.widget.ArrayAdapter
    public final /* bridge */ /* synthetic */ void remove(Object obj) {
        String str = (String) obj;
        if (str == null || !c(str)) {
            super.remove(str);
            return;
        }
        this.f.a.remove(str);
        ((ltd) ((ltd) c.d()).k("com/google/android/apps/inputmethod/libs/translate/LanguageListAdapter", "remove", 190, "LanguageListAdapter.java")).t("Directly remove from recently is not suggested.");
    }

    @Override // android.widget.ArrayAdapter
    public final /* bridge */ /* synthetic */ void addAll(Object[] objArr) {
        setNotifyOnChange(false);
        for (String str : (String[]) objArr) {
            add(str);
        }
        notifyDataSetChanged();
    }
}
