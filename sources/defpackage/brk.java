package defpackage;

import android.content.Context;
import android.database.MatrixCursor;
import android.text.TextUtils;
import androidx.preference.Preference;
import com.google.android.apps.inputmethod.latin.preference.SettingsSearchIndexablesProvider;
import java.util.ArrayDeque;

/* compiled from: PG */
/* renamed from: brk  reason: default package */
/* loaded from: classes.dex */
public final class brk extends brm {
    final /* synthetic */ qv a;
    final /* synthetic */ MatrixCursor b;
    final /* synthetic */ dxz c;
    final /* synthetic */ StringBuilder d;
    final /* synthetic */ inv e;
    final /* synthetic */ SettingsSearchIndexablesProvider f;
    private final ArrayDeque h = new ArrayDeque();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brk(SettingsSearchIndexablesProvider settingsSearchIndexablesProvider, Context context, imt imtVar, qv qvVar, MatrixCursor matrixCursor, dxz dxzVar, StringBuilder sb, inv invVar) {
        super(context, imtVar);
        this.f = settingsSearchIndexablesProvider;
        this.a = qvVar;
        this.b = matrixCursor;
        this.c = dxzVar;
        this.d = sb;
        this.e = invVar;
    }

    @Override // defpackage.brm, defpackage.inz
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        Preference preference = (Preference) obj;
        super.h(preference);
        this.h.push(Integer.valueOf(this.d.length()));
        this.a.h(this.e.c);
        if (preference != null) {
            StringBuilder sb = this.d;
            sb.append(" > ");
            sb.append(preference.q);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.brm, defpackage.inz
    public final void b() {
        super.b();
        this.d.setLength(((Integer) this.h.getFirst()).intValue());
        this.h.pop();
    }

    @Override // defpackage.inz
    protected final /* bridge */ /* synthetic */ void c(Object obj) {
        Preference preference = (Preference) obj;
        if (!SettingsSearchIndexablesProvider.a(preference)) {
            return;
        }
        int intValue = ((Integer) this.a.getOrDefault(preference, 0)).intValue();
        String g = g(preference);
        MatrixCursor matrixCursor = this.b;
        SettingsSearchIndexablesProvider settingsSearchIndexablesProvider = this.f;
        dxz dxzVar = this.c;
        String sb = this.d.toString();
        String[] strArr = lbz.a;
        Object[] objArr = new Object[16];
        objArr[0] = 0;
        objArr[1] = preference.q;
        CharSequence m = preference.m();
        if (!TextUtils.isEmpty(m) && !"%s".equals(m.toString())) {
            objArr[2] = m;
        }
        objArr[6] = sb;
        objArr[8] = Integer.valueOf(intValue);
        objArr[9] = "android.intent.action.MAIN";
        objArr[10] = settingsSearchIndexablesProvider.getContext().getPackageName();
        objArr[11] = dxzVar.getClass().getName();
        objArr[12] = g;
        matrixCursor.addRow(objArr);
    }
}
