package defpackage;

/* compiled from: PG */
/* renamed from: kmk  reason: default package */
/* loaded from: classes.dex */
public enum kmk implements nfp {
    TAG_DO_NOT_USE(0),
    TAG_INVALID_ATTRIBUTION_DO_NOT_USE(921),
    TAG_UNATTRIBUTED(308),
    TAG_GOOGLE_APP_TEST(975),
    TAG_CLASSIC_TEST_AREA_TEST(995),
    TAG_CLASSIC_TEST_AREA(996),
    TAG_GOOGLE_APP_SEARCH(924),
    TAG_GOOGLE_APP_BROWSER(973),
    TAG_ASSISTANT_ACCL(971),
    TAG_ASSISTANT_PCP(1017),
    TAG_ASSISTANT_WEATHER_AT_FLIGHT_LANDING_LO(1033),
    TAG_ASSISTANT_PLATFORM(1021),
    TAG_ASSISTANT_DICTATION(1022),
    TAG_ASSISTANT_TRANSLATE(1023),
    TAG_ASSISTANT_WIDGET(1006),
    TAG_ASSISTANT_STASH(972),
    TAG_ASSISTANT_AMBIENT(1018),
    TAG_ASSISTANT_RECOMMEND(980),
    TAG_ASSISTANT_ROUTINES(1038),
    TAG_ASSISTANT_VOICE(1007),
    TAG_ASSISTANT_MOBILE_ASSISTANT(1013),
    TAG_ASSISTANT_MOBILE_ASSISTANT_LS(1039),
    TAG_NIU_SEARCH(925),
    TAG_NIU_BROWSER(976),
    TAG_UNKNOWN_SILK(977),
    TAG_TRANSCRIPTION_VOICE_RECOGNITION(970),
    TAG_TRANSCRIPTION_VOICE_IME(969),
    TAG_CLASSIC_ASSISTANT_VOICE_MATCH(1028),
    TAG_CLASSIC_ACCESSIBILITY_VOICE_ACCESS(1029),
    TAG_GOOGLE_APP_MINUS_ONE(974),
    TAG_WEATHER_IMMERSIVE(979),
    TAG_SOUND_SEARCH_NOW_PLAYING(990),
    TAG_SOUND_SEARCH_MUSIC_RECOGNITION(1019),
    TAG_GOOGLE_APP_HOMESCREEN(991),
    TAG_CLASSIC_ASSISTANT(901),
    TAG_CLASSIC_ASSISTANT_DEVICE_REGISTRATION(1025),
    TAG_CLASSIC_ASSISTANT_AMBIENT_CLASSIC(902),
    TAG_CLASSIC_ASSISTANT_AMBIENT_BUG_REPORT(1036),
    TAG_CLASSIC_ASSISTANT_AUTO(903),
    TAG_ASSISTANT_AUTO_TNG_COMMS(1000),
    TAG_ASSISTANT_AUTO_TNG_MIC(1020),
    TAG_ASSISTANT_AUTO_TNG_SUGGESTIONS(1001),
    TAG_ASSISTANT_AUTO_TNG_MORRIS(1004),
    TAG_ASSISTANT_AUTO_TNG_POP(1002),
    TAG_CLASSIC_ASSISTANT_BISTO(904),
    TAG_ASSISTANT_TNG_BISTO(1034),
    TAG_CLASSIC_ASSISTANT_FACEMATCH(960),
    TAG_CLASSIC_LENS(911),
    TAG_CLASSIC_ASSISTANT_LEGACY(905),
    TAG_CLASSIC_ASSISTANT_NGA(906),
    TAG_CLASSIC_ASSISTANT_TAPAS(909),
    TAG_CLASSIC_ASSISTANT_SETTINGS(907),
    TAG_CLASSIC_ASSISTANT_SNAPSHOT(908),
    TAG_CLASSIC_ASSISTANT_VOICEACTIONS(910),
    TAG_CLASSIC_ASSISTANT_PCP_CLASSIC(920),
    TAG_CLASSIC_ASSISTANT_PROACTIVEAPI(869),
    TAG_CLASSIC_ASSISTANT_NOTIFICATIONS(785),
    TAG_CLASSIC_ASSISTANT_CAR_LO(945),
    TAG_CLASSIC_ASSISTANT_CLIENTSYNC_LO(937),
    TAG_CLASSIC_ASSISTANT_MORRIS_LO(1005),
    TAG_CLASSIC_ASSISTANT_SMARTSPACE_WEATHER_LO(967),
    TAG_CLASSIC_ASSISTANT_QUARTZ_LO(934),
    TAG_CLASSIC_LENS_LO(933),
    TAG_CLASSIC_SEARCH_EMBEDDED_LO(932),
    TAG_CLASSIC_SEARCH_LO(939),
    TAG_CLASSIC_SEARCH_PROACTIVE(926),
    TAG_CLASSIC_SEARCH_PROACTIVE_LO(938),
    TAG_CLASSIC_SEARCH_SIDEKICK_LO(940),
    TAG_CLASSIC_SERVICES(914),
    TAG_CLASSIC_SERVICES_ACCL(958),
    TAG_CLASSIC_SERVICES_ACCL_LO(935),
    TAG_CLASSIC_SERVICES_CAST(915),
    TAG_CLASSIC_SERVICES_CHIME_LO(930),
    TAG_CLASSIC_SERVICES_CLOCKWORK_LO(931),
    TAG_CLASSIC_SERVICES_CLOCKWORK_MIC(1026),
    TAG_CLASSIC_SERVICES_CONTACTAFFINITY(916),
    TAG_CLASSIC_SERVICES_CONTEXTUALCARDS_LO(936),
    TAG_CLASSIC_SERVICES_LO(900),
    TAG_CLASSIC_SERVICES_MDD_LO(952),
    TAG_CLASSIC_SERVICES_MDI_LIB(929),
    TAG_CLASSIC_SERVICES_SILK_LO(941),
    TAG_CLASSIC_SERVICES_S3_LO(942),
    TAG_CLASSIC_SERVICES_TELEPHONY(922),
    TAG_CLASSIC_SERVICES_TV_LO(944),
    TAG_CLASSIC_SERVICES_WEATHER_LO(943),
    TAG_CLASSIC_SERVICES_WIFI(918),
    TAG_CLASSIC_SERVICES_CO(949),
    TAG_CLASSIC_SERVICES_CLOCKWORK_CO(955),
    TAG_CREATOR_STUDIO_RECORD(997),
    TAG_ASSISTANT_TNG_CAR_LO(1003),
    TAG_CLASSIC_SEARCH_URI_LO(1014),
    TAG_CLASSIC_VOICE_SEARCH_LO(1015),
    TAG_CLASSIC_VOICE_SEARCH_MIC(1027),
    TAG_ASSISTANT_CALENDAR(1016),
    TAG_ASSISTANT_HUBUI(1024),
    TAG_CLASSIC_ASSISTANT_URI_VIS(1030),
    TAG_SCENEVIEWER_CAPTURE(1031),
    TAG_ASSISTANT_TORUS(1032),
    TAG_WEB_X_WEBLAYER(1035),
    TAG_CLASSIC_ASSISTANT_TEXT_SEARCH(1037),
    UNRECOGNIZED(-1);
    
    private final int aX;

    kmk(int i) {
        this.aX = i;
    }

    @Override // defpackage.nfp
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.aX;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
