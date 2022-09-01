package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard;
import com.google.android.apps.inputmethod.libs.search.widget.SearchCandidateListHolderView;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: eep  reason: default package */
/* loaded from: classes.dex */
public final class eep implements ddr, elg {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/keyboard/SearchCandidateListController");
    public List b = Collections.emptyList();
    public gsd c;
    private final eeo d;
    private SearchCandidateListHolderView e;
    private ForegroundColorSpan f;

    public eep(eeo eeoVar) {
        this.d = eeoVar;
    }

    @Override // defpackage.ddr
    public final void b(List list, hln hlnVar, boolean z) {
        int i;
        String str;
        int j;
        List arrayList = list == null ? new ArrayList() : list;
        this.b = new ArrayList(arrayList);
        SearchCandidateListHolderView searchCandidateListHolderView = this.e;
        if (searchCandidateListHolderView != null) {
            searchCandidateListHolderView.e = this;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        String lowerCase = this.d.a().toLowerCase(Locale.ROOT);
        Iterator it = arrayList.iterator();
        while (true) {
            i = 2;
            str = "";
            if (!it.hasNext()) {
                break;
            }
            hln hlnVar2 = (hln) it.next();
            CharSequence charSequence = hlnVar2.a;
            if (charSequence != null) {
                str = charSequence.toString();
            }
            SpannableString spannableString = new SpannableString(str);
            if (!lowerCase.isEmpty() && str.toLowerCase(Locale.ROOT).startsWith(lowerCase)) {
                spannableString.setSpan(this.f, lowerCase.length(), str.length(), 33);
            }
            arrayList2.add(spannableString);
            CharSequence charSequence2 = hlnVar2.d;
            int i2 = R.attr.f3360_resource_name_obfuscated_res_0x7f040080;
            if (charSequence2 != null) {
                int j2 = efq.j(charSequence2);
                if (j2 == 1) {
                    i2 = R.attr.f2270_resource_name_obfuscated_res_0x7f040012;
                } else if (j2 == 3) {
                    i2 = R.attr.f6160_resource_name_obfuscated_res_0x7f04019b;
                } else if (j2 == 6) {
                    i2 = R.attr.f3200_resource_name_obfuscated_res_0x7f040070;
                }
            }
            arrayList3.add(Integer.valueOf(i2));
            CharSequence charSequence3 = hlnVar2.d;
            int i3 = R.string.f150230_resource_name_obfuscated_res_0x7f140182;
            if (charSequence3 != null && (j = efq.j(charSequence3)) != 0) {
                if (j == 1) {
                    i3 = R.string.f148270_resource_name_obfuscated_res_0x7f14006e;
                } else if (j != 2) {
                    if (j == 3) {
                        i3 = R.string.f162920_resource_name_obfuscated_res_0x7f14074b;
                    } else if (j == 6) {
                        i3 = R.string.f149770_resource_name_obfuscated_res_0x7f140142;
                    }
                }
            }
            arrayList4.add(Integer.valueOf(i3));
        }
        SearchCandidateListHolderView searchCandidateListHolderView2 = this.e;
        if (searchCandidateListHolderView2 != null) {
            TypedValue typedValue = new TypedValue();
            int i4 = 0;
            while (i4 < arrayList2.size() && i4 < searchCandidateListHolderView2.a) {
                ((AppCompatTextView) searchCandidateListHolderView2.b.get(i4)).setText((CharSequence) arrayList2.get(i4));
                Context context = searchCandidateListHolderView2.getContext();
                Object[] objArr = new Object[i];
                objArr[0] = searchCandidateListHolderView2.getContext().getString(((Integer) arrayList4.get(i4)).intValue());
                objArr[1] = arrayList2.get(i4);
                ((AppCompatTextView) searchCandidateListHolderView2.b.get(i4)).setContentDescription(context.getString(R.string.f174610_resource_name_obfuscated_res_0x7f140c18, objArr));
                searchCandidateListHolderView2.getContext().getTheme().resolveAttribute(((Integer) arrayList3.get(i4)).intValue(), typedValue, true);
                ((ImageView) searchCandidateListHolderView2.c.get(i4)).setImageResource(typedValue.resourceId);
                ((ImageView) searchCandidateListHolderView2.c.get(i4)).setContentDescription(searchCandidateListHolderView2.getContext().getResources().getString(((Integer) arrayList4.get(i4)).intValue()));
                searchCandidateListHolderView2.getChildAt((searchCandidateListHolderView2.a - 1) - i4).setVisibility(0);
                elg elgVar = searchCandidateListHolderView2.e;
                if (elgVar != null) {
                    eep eepVar = (eep) elgVar;
                    if (eepVar.c == null || i4 >= eepVar.b.size()) {
                        ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/keyboard/SearchCandidateListController", "onShowCandidate", 239, "SearchCandidateListController.java")).y("Tried to show a candidate at position %d [size=%d]", i4, eepVar.b.size());
                    } else {
                        ((SearchKeyboard) eepVar.c.b).O((hln) eepVar.b.get(i4));
                    }
                }
                i4++;
                i = 2;
            }
            while (i4 < searchCandidateListHolderView2.a) {
                ((AppCompatTextView) searchCandidateListHolderView2.b.get(i4)).setText(str);
                ((ImageView) searchCandidateListHolderView2.c.get(i4)).setImageResource(0);
                searchCandidateListHolderView2.getChildAt((searchCandidateListHolderView2.a - 1) - i4).setVisibility(0);
                i4++;
            }
        }
    }

    @Override // defpackage.ddr
    public final void c(Context context, ibm ibmVar, iav iavVar) {
        int a2;
        ColorStateList a3 = hjg.n(context).a(R.color.f30920_resource_name_obfuscated_res_0x7f0608c0);
        if (a3 == null) {
            a2 = us.a(context, R.color.f30920_resource_name_obfuscated_res_0x7f0608c0);
        } else {
            a2 = a3.getDefaultColor();
        }
        this.f = new ForegroundColorSpan(a2);
    }

    @Override // defpackage.ddr, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // defpackage.ddr
    public final void e() {
    }

    @Override // defpackage.ddr
    public final void f(long j, long j2) {
    }

    @Override // defpackage.ddr
    public final void g(View view, icf icfVar) {
        this.e = (SearchCandidateListHolderView) view.findViewById(R.id.f68020_resource_name_obfuscated_res_0x7f0b08b4);
    }

    @Override // defpackage.ddr
    public final void h(icf icfVar) {
        this.e = null;
    }

    @Override // defpackage.ddr
    public final void j(boolean z) {
    }

    @Override // defpackage.ddr
    public final boolean k(hfd hfdVar) {
        return true;
    }

    @Override // defpackage.ddr
    public final boolean l(ice iceVar) {
        throw null;
    }

    @Override // defpackage.ddr
    public final void n() {
    }
}
