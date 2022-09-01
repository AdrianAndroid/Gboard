package defpackage;

import androidx.preference.Preference;
import java.text.Collator;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: dnc  reason: default package */
/* loaded from: classes.dex */
final class dnc implements Comparator {
    private final Collator a = Collator.getInstance();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return this.a.compare(((Preference) obj).q.toString(), ((Preference) obj2).q.toString());
    }
}
