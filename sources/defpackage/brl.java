package defpackage;

import android.content.Context;
import android.database.MatrixCursor;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.inputmethod.latin.preference.SettingsSearchIndexablesProvider;
import java.util.ArrayDeque;

/* compiled from: PG */
/* renamed from: brl  reason: default package */
/* loaded from: classes.dex */
public final class brl extends brm {
    final /* synthetic */ MatrixCursor a;
    final /* synthetic */ inw b;
    final /* synthetic */ Context c;
    private final ArrayDeque d = new ArrayDeque();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brl(Context context, imt imtVar, MatrixCursor matrixCursor, inw inwVar, Context context2) {
        super(context, imtVar);
        this.a = matrixCursor;
        this.b = inwVar;
        this.c = context2;
    }

    private final void j() {
        this.d.removeLast();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.inz
    /* renamed from: k */
    public final void d(Preference preference) {
        ArrayDeque arrayDeque = this.d;
        boolean z = false;
        if (preference != null && l(preference)) {
            z = true;
        }
        arrayDeque.addLast(Boolean.valueOf(z));
    }

    private final boolean l(Preference preference) {
        if (this.b == null) {
            return true;
        }
        if (!this.d.isEmpty() && ((Boolean) this.d.getLast()).booleanValue()) {
            return true;
        }
        inw inwVar = this.b;
        if (inwVar.a.contains(preference.t) || imy.d(preference.w, true) || !brh.c(this.c, preference)) {
            return true;
        }
        if (!(preference instanceof PreferenceGroup)) {
            return false;
        }
        for (Preference preference2 : ((ljl) this.g.b).b((PreferenceGroup) preference)) {
            if (!l(preference2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.brm, defpackage.inz
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        Preference preference = (Preference) obj;
        super.h(preference);
        d(preference);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.brm, defpackage.inz
    public final void b() {
        super.b();
        j();
    }

    @Override // defpackage.inz
    protected final /* bridge */ /* synthetic */ void c(Object obj) {
        Preference preference = (Preference) obj;
        if (!SettingsSearchIndexablesProvider.a(preference) || !l(preference)) {
            return;
        }
        String g = g(preference);
        MatrixCursor matrixCursor = this.a;
        String[] strArr = lbz.a;
        matrixCursor.addRow(new Object[]{g});
    }

    @Override // defpackage.inz
    protected final /* synthetic */ void e(Object obj) {
        PreferenceGroup preferenceGroup = (PreferenceGroup) obj;
        j();
    }
}
