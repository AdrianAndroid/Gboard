package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: ifm  reason: default package */
/* loaded from: classes.dex */
public final class ifm {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/metricstracker/SlownessReporterUtil");
    public static final hhl b = hhq.a("report_typing_slowness_to_better_bug", false);
    public final idk c;
    public final Context d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public ifm(Context context, idk idkVar) {
        this.d = context;
        this.c = idkVar;
    }

    public static void a(View view, boolean z) {
        View findViewById = view.findViewById(R.id.f68560_resource_name_obfuscated_res_0x7f0b08f9);
        int i = 8;
        if (findViewById != null) {
            findViewById.setVisibility(true != z ? 8 : 0);
        }
        View findViewById2 = view.findViewById(R.id.f68570_resource_name_obfuscated_res_0x7f0b08fa);
        if (findViewById2 != null) {
            if (true != z) {
                i = 0;
            }
            findViewById2.setVisibility(i);
        }
        gqa.a(view.getContext()).l(true != z ? R.string.f155930_resource_name_obfuscated_res_0x7f140405 : R.string.f156220_resource_name_obfuscated_res_0x7f140422);
    }
}
