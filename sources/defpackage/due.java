package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import androidx.preference.Preference;

/* compiled from: PG */
/* renamed from: due  reason: default package */
/* loaded from: classes.dex */
public final class due extends Preference {
    public due(Context context) {
        super(context);
    }

    @Override // androidx.preference.Preference
    public final void a(ais aisVar) {
        super.a(aisVar);
        View F = aisVar.F(16908304);
        if (F instanceof AppCompatTextView) {
            jcq.a((AppCompatTextView) F);
        }
    }
}
