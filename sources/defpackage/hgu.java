package defpackage;

/* compiled from: PG */
/* renamed from: hgu  reason: default package */
/* loaded from: classes.dex */
public enum hgu implements ido {
    ALREADY_INSTALLED,
    DEFERRED_INSTALL_REQUESTED,
    NEWLY_INSTALLED,
    DEFERRED_INSTALL_FAILED,
    BRELLA_JNI_LOADED_FROM_FEATURE_SPLIT,
    BRELLA_JNI_LOADED_FROM_EMBEDDED_SHARED_OBJECT,
    BRELLA_JNI_LOADED_FROM_EMBEDDED_SHARED_OBJECT_WITH_STUB,
    BRELLA_JNI_FAILED_IN_LOADING;

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final /* synthetic */ String b() {
        return "";
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }
}
