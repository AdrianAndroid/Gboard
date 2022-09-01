package defpackage;

/* compiled from: PG */
/* renamed from: egc  reason: default package */
/* loaded from: classes.dex */
enum egc implements ctc {
    FIRE_LAUNCH_BITMOJI_SUCCESS(1),
    FIRE_LAUNCH_BITMOJI_FAILURE(2),
    NOT_INSTALLED_FIRE_BITMOJI_PLAYSTORE_INTENT_SUCCESS(3),
    NOT_INSTALLED_FIRE_BITMOJI_PLAYSTORE_INTENT_FAILURE(4),
    UPDATE_REQUIRED_FIRE_BITMOJI_PLAYSTORE_INTENT_SUCCESS(5),
    UPDATE_REQUIRED_FIRE_BITMOJI_PLAYSTORE_INTENT_FAILURE(6),
    FIRE_ACCESS_REQUEST_SUCCESS(7),
    FIRE_ACCESS_REQUEST_FAILURE(8);
    
    private final int j;

    egc(int i2) {
        this.j = i2;
    }

    @Override // defpackage.ctc
    public final int a() {
        return this.j;
    }
}
