package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: afg  reason: default package */
/* loaded from: classes.dex */
public final class afg extends aff {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afg(an anVar, ViewGroup viewGroup) {
        super(anVar, "Attempting to add fragment " + anVar + " to container " + viewGroup + " which is not a FragmentContainerView");
        oll.e(anVar, "fragment");
    }
}
