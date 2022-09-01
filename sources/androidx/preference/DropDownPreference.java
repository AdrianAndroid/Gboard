package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    private final Context K;
    private final ArrayAdapter L;
    private Spinner M;
    private final AdapterView.OnItemSelectedListener N = new nc(this, 2);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f11100_resource_name_obfuscated_res_0x7f0403d5, 0);
        this.K = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.L = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = ((ListPreference) this).g;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.L.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void a(ais aisVar) {
        Spinner spinner = (Spinner) aisVar.a.findViewById(R.id.f128920_resource_name_obfuscated_res_0x7f0b2115);
        this.M = spinner;
        spinner.setAdapter((SpinnerAdapter) this.L);
        this.M.setOnItemSelectedListener(this.N);
        Spinner spinner2 = this.M;
        String str = ((ListPreference) this).i;
        CharSequence[] charSequenceArr = ((ListPreference) this).h;
        int i = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length >= 0) {
                    if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                        i = length;
                        break;
                    }
                    length--;
                } else {
                    break;
                }
            }
        }
        spinner2.setSelection(i);
        super.a(aisVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void c() {
        this.M.performClick();
    }

    @Override // androidx.preference.Preference
    public final void d() {
        super.d();
        ArrayAdapter arrayAdapter = this.L;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
