package defpackage;

import com.google.android.libraries.search.p6glow.AssistantP6GlowView;
import j$.time.Duration;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kln  reason: default package */
/* loaded from: classes.dex */
public final class kln extends olm implements okq {
    final /* synthetic */ AssistantP6GlowView a;
    final /* synthetic */ klo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kln(AssistantP6GlowView assistantP6GlowView, klo kloVar) {
        super(1);
        this.a = assistantP6GlowView;
        this.b = kloVar;
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Duration ofMillis;
        klj kljVar = (klj) obj;
        oll.e(kljVar, "it");
        kki.h();
        AssistantP6GlowView assistantP6GlowView = this.a;
        klj kljVar2 = klj.GONE;
        int ordinal = kljVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            ofMillis = Duration.ofMillis(14L);
            oll.d(ofMillis, "ofMillis(14)");
        } else if (ordinal == 2) {
            ofMillis = Duration.ofMillis(12L);
            oll.d(ofMillis, "ofMillis(12)");
        } else if (ordinal == 3) {
            ofMillis = Duration.ofMillis(8L);
            oll.d(ofMillis, "ofMillis(8)");
        } else {
            throw new ojb();
        }
        oll.e(ofMillis, "<set-?>");
        assistantP6GlowView.b = ofMillis;
        klo kloVar = this.b;
        kloVar.d(kloVar.b, kljVar);
        this.b.b = kljVar;
        return oji.a;
    }
}
